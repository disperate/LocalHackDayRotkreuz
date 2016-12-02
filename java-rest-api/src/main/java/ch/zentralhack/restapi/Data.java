package main.java.ch.zentralhack.restapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("datetime")
    @Expose
    private List<String> datetime = new ArrayList<String>();
    @SerializedName("temperature")
    @Expose
    private List<Double> temperature = new ArrayList<Double>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param datetime
     * @param temperature
     */
    public Data(List<String> datetime, List<Double> temperature) {
        this.datetime = datetime;
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The datetime
     */
    public List<String> getDatetime() {
        return datetime;
    }

    /**
     * 
     * @param datetime
     *     The datetime
     */
    public void setDatetime(List<String> datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public List<Double> getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    public void setTemperature(List<Double> temperature) {
        this.temperature = temperature;
    }

}
