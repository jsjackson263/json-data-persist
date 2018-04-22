# A Sample Spring Boot Application
 - Reads JSON data from a file, & populates into an H2 database
 - Spring boot version 2.0.0
 - exposes actuator end points 
      - http://localhost:9904/actuator/{endpoint}
 - to get list of actuator metrics:
      - http://localhost:9904/actuator/metrics
 
 - to get actual value of a specific actuator metric:
      - http://localhost:9904/actuator/metrics/{metric}
      - e.g. http://localhost:9904/actuator/metrics/jvm.memory.used
  
 - jolokia:
      - http://localhost:9904/actuator/jolokia/read/java.lang:type=Memory/HeapMemoryUsage
