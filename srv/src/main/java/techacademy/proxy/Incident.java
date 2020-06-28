//# xsc 20.1.2-a5868d-20200407

package techacademy.proxy;

public class Incident
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property incidentCategory = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentCategory");

    public static final com.sap.cloud.server.odata.Property incidentDate = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentDate");

    public static final com.sap.cloud.server.odata.Property incidentDescription = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentDescription");

    public static final com.sap.cloud.server.odata.Property incidentID = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentID");

    public static final com.sap.cloud.server.odata.Property incidentLocatioon = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentLocatioon");

    public static final com.sap.cloud.server.odata.Property incidentPhoto = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentPhoto");

    public static final com.sap.cloud.server.odata.Property incidentStatus = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("IncidentStatus");

    public static final com.sap.cloud.server.odata.Property reportedBy = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("ReportedBy");

    public static final com.sap.cloud.server.odata.Property urgencyLevel = techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident.getProperty("UrgencyLevel");

    public Incident()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:35:5
        this(true);
    }

    public Incident(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:35:5
        super(withDefaults, techacademy.proxy.TechacademyServiceMetadata.EntityTypes.incident);
    }

    public techacademy.proxy.Incident copy()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:20:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.copyEntity());
    }

    public String getIncidentCategory()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:66:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.incidentCategory));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getIncidentDate()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:79:5
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(techacademy.proxy.Incident.incidentDate));
    }

    public String getIncidentDescription()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:92:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.incidentDescription));
    }

    public long getIncidentID()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:105:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(techacademy.proxy.Incident.incidentID));
    }

    public String getIncidentLocatioon()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:118:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.incidentLocatioon));
    }

    public byte[] getIncidentPhoto()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:131:5
        return com.sap.cloud.server.odata.BinaryValue.toNullable(this.getDataValue(techacademy.proxy.Incident.incidentPhoto));
    }

    public String getIncidentStatus()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:144:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.incidentStatus));
    }

    public techacademy.proxy.Incident getOld()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:15:5
        return techacademy.proxy.internal.Any_as_techacademy_proxy_Incident.cast(this.getOldEntity());
    }

    public String getReportedBy()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:157:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.reportedBy));
    }

    public String getUrgencyLevel()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:170:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(techacademy.proxy.Incident.urgencyLevel));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long incidentID)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("IncidentID", com.sap.cloud.server.odata.LongValue.of(incidentID));
    }

    public static techacademy.proxy.IncidentList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:30:12
        return techacademy.proxy.IncidentList.share(from);
    }

    public void setIncidentCategory(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:71:5
        this.setDataValue(techacademy.proxy.Incident.incidentCategory, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setIncidentDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:84:5
        this.setDataValue(techacademy.proxy.Incident.incidentDate, value);
    }

    public void setIncidentDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:97:5
        this.setDataValue(techacademy.proxy.Incident.incidentDescription, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setIncidentID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:110:5
        this.setDataValue(techacademy.proxy.Incident.incidentID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setIncidentLocatioon(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:123:5
        this.setDataValue(techacademy.proxy.Incident.incidentLocatioon, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setIncidentPhoto(final byte[] value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:136:5
        this.setDataValue(techacademy.proxy.Incident.incidentPhoto, com.sap.cloud.server.odata.BinaryValue.ofNullable(value));
    }

    public void setIncidentStatus(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:149:5
        this.setDataValue(techacademy.proxy.Incident.incidentStatus, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setReportedBy(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:162:5
        this.setDataValue(techacademy.proxy.Incident.reportedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setUrgencyLevel(final String value)
    {
        //# /usr/sap/ljs/xs-temp/32c3a3b1-9f62-446c-9043-e88da0175a27/output/target/tmp/proxy-techacademy.csdl.xs:175:5
        this.setDataValue(techacademy.proxy.Incident.urgencyLevel, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
