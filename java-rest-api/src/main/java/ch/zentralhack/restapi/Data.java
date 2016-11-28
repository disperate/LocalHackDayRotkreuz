package ch.zentralhack.restapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("datetime")
    @Expose
    public List<String> datetime = new ArrayList<String>();
    @SerializedName("temperature")
    @Expose
    public List<Double> temperature = new ArrayList<Double>();

    @Override
    public String toString() {
        return "ch.zentralhack.restapi.Data{" +
                "datetime=" + datetime +
                ", temperature=" + temperature +
                '}';
    }

    public List<String> getDatetime() {
        return datetime;
    }

    public void setDatetime(List<String> datetime) {
        this.datetime = datetime;
    }

    public List<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<Double> temperature) {
        this.temperature = temperature;
    }
}
