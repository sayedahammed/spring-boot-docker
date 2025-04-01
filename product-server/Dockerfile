FROM openjdk:17-jdk-alpine
LABEL authors="sayed.ahammed"
COPY target/product-server-0.0.1-SNAPSHOT.jar product-server-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/product-server-1.0.0.jar"]