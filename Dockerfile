FROM amazoncorretto:11-alpine

COPY target/SpringDocker-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080