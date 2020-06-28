// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package techacademy.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Incident;

    public static void withServlet(techacademy.MainServlet servlet) {
        techacademy.proxy.TechacademyService service = (techacademy.proxy.TechacademyService)servlet.getDataService();
        handler_Incident = new techacademy.handler.IncidentHandler(servlet, service);
        servlet.registerEntityHandler(techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident, handler_Incident);
    }
}
