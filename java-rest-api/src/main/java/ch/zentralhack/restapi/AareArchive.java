package main.java.ch.zentralhack.restapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AareArchive {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("dataformat")
    @Expose
    private List<String> dataformat = new ArrayList<String>();
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("timeformat")
    @Expose
    private String timeformat;
    @SerializedName("outputformat")
    @Expose
    private String outputformat;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("datafill")
    @Expose
    private String datafill;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AareArchive() {
    }

    /**
     * 
     * @param to
     * @param source
     * @param data
     * @param outputformat
     * @param from
     * @param datafill
     * @param dataformat
     * @param timeformat
     * @param metadata
     */
    public AareArchive(Data data, List<String> dataformat, String source, String from, String to, String timeformat, String outputformat, Metadata metadata, String datafill) {
        this.data = data;
        this.dataformat = dataformat;
        this.source = source;
        this.from = from;
        this.to = to;
        this.timeformat = timeformat;
        this.outputformat = outputformat;
        this.metadata = metadata;
        this.datafill = datafill;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The dataformat
     */
    public List<String> getDataformat() {
        return dataformat;
    }

    /**
     * 
     * @param dataformat
     *     The dataformat
     */
    public void setDataformat(List<String> dataformat) {
        this.dataformat = dataformat;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The from
     */
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 
     * @return
     *     The to
     */
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The timeformat
     */
    public String getTimeformat() {
        return timeformat;
    }

    /**
     * 
     * @param timeformat
     *     The timeformat
     */
    public void setTimeformat(String timeformat) {
        this.timeformat = timeformat;
    }

    /**
     * 
     * @return
     *     The outputformat
     */
    public String getOutputformat() {
        return outputformat;
    }

    /**
     * 
     * @param outputformat
     *     The outputformat
     */
    public void setOutputformat(String outputformat) {
        this.outputformat = outputformat;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The datafill
     */
    public String getDatafill() {
        return datafill;
    }

    /**
     * 
     * @param datafill
     *     The datafill
     */
    public void setDatafill(String datafill) {
        this.datafill = datafill;
    }

}
