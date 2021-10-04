FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/orders-microservice-0.0.1-SNAPSHOT.jar orders-server.jar
ENTRYPOINT ["java","-jar","/orders-server.jar"]