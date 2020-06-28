//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy;

public class IncidentList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<techacademy.proxy.Incident>
{
    public static final techacademy.proxy.IncidentList empty = new techacademy.proxy.IncidentList(java.lang.Integer.MIN_VALUE);

    public IncidentList()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public IncidentList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final techacademy.proxy.IncidentList list)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public techacademy.proxy.IncidentList addThis(final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public techacademy.proxy.IncidentList copy()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public techacademy.proxy.Incident first()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.getUntypedList().first());
    }

    public static techacademy.proxy.IncidentList from(final java.util.List<techacademy.proxy.Incident> list)
    {
        return IncidentList.share(new com.sap.cloud.server.odata.core.GenericList<techacademy.proxy.Incident>(list).toAnyList());
    }

    public techacademy.proxy.Incident get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final techacademy.proxy.Incident item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final techacademy.proxy.IncidentList list)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<techacademy.proxy.Incident> iterator()
    {
        return this.toGeneric().iterator();
    }

    public techacademy.proxy.Incident last()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final techacademy.proxy.Incident item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final techacademy.proxy.Incident item)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static techacademy.proxy.IncidentList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final techacademy.proxy.IncidentList result = new techacademy.proxy.IncidentList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof techacademy.proxy.Incident)
                {
                    final techacademy.proxy.Incident var_item = ((techacademy.proxy.Incident)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public techacademy.proxy.Incident single()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.getUntypedList().single());
    }

    public techacademy.proxy.IncidentList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public techacademy.proxy.IncidentList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:400:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final techacademy.proxy.IncidentList result = new techacademy.proxy.IncidentList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:402:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:407:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident);
    }

    public java.util.List<techacademy.proxy.Incident> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<techacademy.proxy.Incident>(this);
    }
}
