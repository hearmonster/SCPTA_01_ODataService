// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package techacademy.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener incidentListener;

    public static void withServlet(techacademy.MainServlet servlet) {
        techacademy.proxy.TechacademyService service = (techacademy.proxy.TechacademyService)servlet.getDataService();
        incidentListener = new techacademy.listener.IncidentListener(servlet, service);
        servlet.registerEntityListener(techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident, incidentListener);
    }
}
