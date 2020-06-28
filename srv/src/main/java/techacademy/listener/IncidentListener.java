package techacademy.listener;

import com.sap.cloud.server.odata.*;

public class IncidentListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private techacademy.MainServlet servlet;
    private techacademy.proxy.TechacademyService service;

    public IncidentListener(techacademy.MainServlet servlet, techacademy.proxy.TechacademyService service) {
        super();
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public void beforeQuery(DataQuery query) {
        allowUnused(query);
    }

    public void beforeSave(EntityValue entityValue) {
        // Shared code for beforeCreate / beforeUpdate.
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        techacademy.proxy.Incident entity = (techacademy.proxy.Incident)entityValue;
        allowUnused(entity);
    }
}
