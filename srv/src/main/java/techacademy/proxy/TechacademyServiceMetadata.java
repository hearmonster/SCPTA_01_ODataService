//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy;

public abstract class TechacademyServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = techacademy.proxy.TechacademyServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:225:12
        techacademy.proxy.internal.TechacademyServiceFactory.registerAll();
        techacademy.proxy.internal.TechacademyServiceMetadataParser.parsed.setGeneratedProxies(true);
        return techacademy.proxy.internal.TechacademyServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType incident = techacademy.proxy.internal.TechacademyServiceMetadataParser.parsed.getEntityType("techacademy.Incident");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet incidentSet = techacademy.proxy.internal.TechacademyServiceMetadataParser.parsed.getEntitySet("IncidentSet");
    }
}
