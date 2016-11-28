package ch.zentralhack.restapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Metadata {

    @SerializedName("temperature")
    @Expose
    public Temperature temperature;

    @Override
    public String toString() {
        return "ch.zentralhack.restapi.Metadata{" +
                "temperature=" + temperature +
                '}';
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
