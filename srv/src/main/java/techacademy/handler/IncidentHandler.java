// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package techacademy.handler;

import com.sap.cloud.server.odata.*;

public class IncidentHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private techacademy.MainServlet servlet;
    private techacademy.proxy.TechacademyService service;

    public IncidentHandler(techacademy.MainServlet servlet, techacademy.proxy.TechacademyService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        entity.setMustBeModified(true);
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        service.deleteEntity(entity);
    }
}
