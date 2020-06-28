//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy;

public class TechacademyService
    extends com.sap.cloud.server.odata.DataService
{
    public TechacademyService()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:273:5
        this(null);
    }

    public TechacademyService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:273:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "TechacademyService"));
        this.getProvider().setMetadata(techacademy.proxy.TechacademyServiceMetadata.document);
    }

    public techacademy.proxy.Incident getIncident(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:285:5
        return this.getIncident(query, null, null);
    }

    public techacademy.proxy.Incident getIncident(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:285:5
        return this.getIncident(query, headers, null);
    }

    public techacademy.proxy.Incident getIncident(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:285:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.executeQuery(query.fromDefault(techacademy.proxy.TechacademyServiceMetadata.EntitySets.incidentSet), var_headers, var_options).getRequiredEntity());
    }

    public techacademy.proxy.IncidentList getIncidentSet()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:300:5
        return this.getIncidentSet(null, null, null);
    }

    public techacademy.proxy.IncidentList getIncidentSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:300:5
        return this.getIncidentSet(query, null, null);
    }

    public techacademy.proxy.IncidentList getIncidentSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:300:5
        return this.getIncidentSet(query, headers, null);
    }

    public techacademy.proxy.IncidentList getIncidentSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:300:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return techacademy.proxy.Incident.list(this.executeQuery(var_query.fromDefault(techacademy.proxy.TechacademyServiceMetadata.EntitySets.incidentSet), var_headers, var_options).getEntityList());
    }

    public techacademy.proxy.Incident getIncidentWithKey(final long incidentID)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:293:5
        return this.getIncidentWithKey(incidentID, null, null, null);
    }

    public techacademy.proxy.Incident getIncidentWithKey(final long incidentID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:293:5
        return this.getIncidentWithKey(incidentID, query, null, null);
    }

    public techacademy.proxy.Incident getIncidentWithKey(final long incidentID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:293:5
        return this.getIncidentWithKey(incidentID, query, headers, null);
    }

    public techacademy.proxy.Incident getIncidentWithKey(final long incidentID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:293:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getIncident(var_query.withKey(techacademy.proxy.Incident.key(incidentID)), headers, options);
    }

    @java.lang.Override public com.sap.cloud.server.odata.MetadataLock getMetadataLock()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:260:5
        return techacademy.proxy.TechacademyServiceMetadata.lock;
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:279:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
