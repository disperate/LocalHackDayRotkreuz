package ch.zentralhack.restapi;

import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Main {

    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://aare.schwumm.ch/api/archive");
        webTarget.queryParam("from", "yesterday");
        webTarget.queryParam("to", "today");
        String response = webTarget.request().get(String.class);
        System.out.println(response);

        Gson gson = new Gson();
        AareArchive archive = gson.fromJson(response, AareArchive.class);

        archive.getData().getTemperature().stream()
                .filter(t -> t != null)
                .filter(t -> t < 9.5)
                .forEach(t -> System.out.println(t + " Grad??? Brrr kalt!"));
    }
}
