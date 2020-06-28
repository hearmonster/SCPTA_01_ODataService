//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy.internal;

public abstract class Any_as_techacademy_proxy_Incident
{
    public static techacademy.proxy.Incident cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof techacademy.proxy.Incident)
        {
            final techacademy.proxy.Incident var_value = ((techacademy.proxy.Incident)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "techacademy.proxy.Incident");
        }
    }
}
