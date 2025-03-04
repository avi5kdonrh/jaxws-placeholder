## jaxws-placeholder issue
- The jaxws:client is unable to resolve the configured address placeholder
```xml
    <jaxws:client name="cxfClient" id="cxfClient"
                  serviceClass="org.example.MyService"
                  address="${my.address}" />
```
- To run the application
```xml
mvn spring-boot:run
```
- It throws the following error even though my.address is configured in application.properties.
```xml
Caused by: java.net.URISyntaxException: Illegal character in path at index 1: ${my.address}
```