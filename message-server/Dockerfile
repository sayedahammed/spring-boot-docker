FROM openjdk:17-jdk-alpine
LABEL authors="sayed.ahammed"
COPY target/message-server-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/message-server-1.0.0.jar"]