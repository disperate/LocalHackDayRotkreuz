package main.java.ch.zentralhack.restapi;

import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * Created by robinb on 02.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://aare.schwumm.ch/api/archive");
        webTarget.queryParam("from", "yesterday");
        webTarget.queryParam("to", "today");
        String response = webTarget.request().get(String.class);
        System.out.println("Raw response: " + response);

        Gson gson = new Gson();
        AareArchive archive = gson.fromJson(response, AareArchive.class);

        System.out.println("main.java.ch.zentralhack.restapi.Temperature data: " + archive.getData().getTemperature());

        System.out.println("Number of minutes < 8.5 degree Celsius: " +
                archive.getData().getTemperature().stream()
                        .filter(temperature -> temperature != null && temperature < 8.5)
                        .count() * 10
        );
    }
}
