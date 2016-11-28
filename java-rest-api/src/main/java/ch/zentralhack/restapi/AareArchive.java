package ch.zentralhack.restapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AareArchive {

    @SerializedName("data")
    @Expose
    public Data data;
    @SerializedName("dataformat")
    @Expose
    public List<String> dataformat = new ArrayList<String>();
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("from")
    @Expose
    public String from;
    @SerializedName("to")
    @Expose
    public String to;
    @SerializedName("timeformat")
    @Expose
    public String timeformat;
    @SerializedName("outputformat")
    @Expose
    public String outputformat;
    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("datafill")
    @Expose
    public String datafill;

    @Override
    public String toString() {
        return "ch.zentralhack.restapi.AareArchive{" +
                "data=" + data +
                ", dataformat=" + dataformat +
                ", source='" + source + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", timeformat='" + timeformat + '\'' +
                ", outputformat='" + outputformat + '\'' +
                ", metadata=" + metadata +
                ", datafill='" + datafill + '\'' +
                '}';
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<String> getDataformat() {
        return dataformat;
    }

    public void setDataformat(List<String> dataformat) {
        this.dataformat = dataformat;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTimeformat() {
        return timeformat;
    }

    public void setTimeformat(String timeformat) {
        this.timeformat = timeformat;
    }

    public String getOutputformat() {
        return outputformat;
    }

    public void setOutputformat(String outputformat) {
        this.outputformat = outputformat;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getDatafill() {
        return datafill;
    }

    public void setDatafill(String datafill) {
        this.datafill = datafill;
    }
}
