package ch.zentralhack.restapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Temperature {

    @SerializedName("min")
    @Expose
    public Double min;
    @SerializedName("max")
    @Expose
    public Double max;
    @SerializedName("average")
    @Expose
    public Double average;

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "ch.zentralhack.restapi.Temperature{" +
                "min=" + min +
                ", max=" + max +
                ", average=" + average +
                '}';
    }
}
