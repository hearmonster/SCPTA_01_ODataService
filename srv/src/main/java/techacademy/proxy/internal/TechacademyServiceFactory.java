//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy.internal;

public abstract class TechacademyServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:235:12
        techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.registerFactory(new techacademy.proxy.internal.TechacademyServiceFactory.CreateIncident());
    }

    public static class CreateIncident
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:249:9
            return new techacademy.proxy.Incident(false);
        }
    }
}
