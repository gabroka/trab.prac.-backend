from amazoncorretto:19-alpine-jdk

copy target/jv8spring2.7-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]