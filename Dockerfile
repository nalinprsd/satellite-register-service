FROM openjdk:8-jre-slim

EXPOSE 8080

ADD target/satellite-register-service.jar satellite-register-service.jar

ENTRYPOINT ["java", "-jar", "satellite-register-service.jar"]dd