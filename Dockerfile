FROM openjdk:8-jdk-alpine3.7
ADD ./target/Entittlement_Service-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]