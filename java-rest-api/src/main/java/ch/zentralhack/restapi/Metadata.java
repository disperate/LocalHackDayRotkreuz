package main.java.ch.zentralhack.restapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Metadata {

    @SerializedName("temperature")
    @Expose
    private Temperature temperature;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param temperature
     */
    public Metadata(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

}
