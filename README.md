# A Sample Spring Boot Application
 - Reads JSON data from a file, & populates into an H2 database
 - Spring boot version 1.x
 - exposes actuator end points 
    - http://localhost:9902/{endpoint}
 - to get list of actuator metrics:
    - http://localhost:9902/metrics
 
 - jolokia:
    - http://localhost:9902/jolokia/read/java.lang:type=Memory/HeapMemoryUsage
