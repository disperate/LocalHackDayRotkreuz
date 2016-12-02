## Consuming REST APIs in Java

- What is a REST APIs
  - Application Programmable Interface
  - Schnittstelle zwischen Programmen --> nicht für User gedacht
  - Bsp. Webseite http://www.aare.guru/ für User, für Programme aber umständlich  
  Lösung: http://aare.schwumm.ch/api/ --> http://aare.schwumm.ch/aare.json
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
// get the list of temperatures
System.out.println(archive.getData().getTemperature().toString());

long coldCount = archive.getData().getTemperature().stream()
        .filter(temperature -> temperature != null)
        .filter(temperature -> temperature < 8.5)
        .count();

System.out.println(coldCount);
```
