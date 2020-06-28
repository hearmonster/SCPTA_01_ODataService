// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package techacademy.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public com.sap.cloud.server.odata.core.ThreadShutdown shutdown = new com.sap.cloud.server.odata.core.ThreadShutdown();

    public InMemoryDatabase provider;

    public techacademy.proxy.TechacademyService service;

    // logger for client interactions
    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("odata.server");

    // logger for database interactions
    public org.slf4j.Logger serviceLogger = org.slf4j.LoggerFactory.getLogger("odata.sql.my-database");

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setServiceName("odataservice_p3861");
        this.checkServerRuntime("sap.cf");
        this.setTraceRequests(logger.isDebugEnabled());
        this.setTraceWithData(logger.isTraceEnabled());
        this.setPrettyTracing(techacademy.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(true);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("TechacademyService");
        techacademy.ProviderSettings.init((techacademy.MainServlet)this);
        techacademy.ProviderSettings.init(provider);
        service = new techacademy.proxy.TechacademyService(provider);
        service.getMetadata().addDeltaHandling();
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        service.getMetadata().applyAnnotations();
        service.getMetadata().removeServerOnly("SQL");
        service.getMetadata().removeReferences("SQL");
        provider.createSchema();
        this.loadInitialData(techacademy.TestSettings.TEST_MODE);
        RegisterHandlers.withServlet((techacademy.MainServlet)this);
        RegisterListeners.withServlet((techacademy.MainServlet)this);
        this.logInfo("Started OData service");
    }

    public void destroy() {
        shutdown.signal();
        this.logInfo("Stopped OData service");
    }

    public DataService getDataService() {
        return service;
    }
}
