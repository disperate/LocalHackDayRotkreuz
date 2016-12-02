## Consuming REST APIs in Java

- What is a REST APIs
  - Application Programmable Interface
  - Interface between programs --> not for the user
  - Ex. http://www.aare.guru/ for the user, not practical for programs  
  Solution: http://aare.schwumm.ch/api/ --> http://aare.schwumm.ch/aare.json
- Jersey
  - Simple GET with Parameters

    ```java
    Client client = ClientBuilder.newClient();
    WebTarget webTarget = client.target("http://aare.schwumm.ch/api/archive");
    webTarget.queryParam("from", "yesterday");
    webTarget.queryParam("to", "today");
    String response = webTarget.request().get(String.class);
    System.out.println(response);
    ```
- Parsing JSON to Java Objects
  - http://www.jsonschema2pojo.org/
  - Gson

  ```java
  Gson gson = new Gson();
  AareArchive archive = gson.fromJson(response, AareArchive.class);
  ```
- Using the data

```java
System.out.println(archive.getData().getTemperature();

System.out.println("Number of minutes < 8.5 degree Celsius: " +
        archive.getData().getTemperature().stream()
                .filter(temperature -> temperature != null && temperature < 8.5)
                .count() * 10
);
```
