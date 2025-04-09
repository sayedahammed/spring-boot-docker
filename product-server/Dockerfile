# Stage 1: Build the JAR

# Base Image (Maven, JDK 17, and Alpine Linux).
# This Lets us wrapper download its required distribution
# and build the project inside Docker easily
FROM maven:3.9.6-eclipse-temurin-17-alpine AS builder

# Set work directory
WORKDIR /app

# Copy pom.xml and .mvn folder + mvnw first to leverage Docker cache
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src ./src

# Package the application
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the app with a minimal image
FROM openjdk:17-jdk-alpine

# Set maintainer label
LABEL authors="sayed.ahammed"

# Copy only the built JAT from builder stage
COPY --from=builder /app/target/product-server-0.0.1-SNAPSHOT.jar /product-server.jar

# Run the app
ENTRYPOINT ["java", "-jar", "/product-server.jar"]

## Use the official OpenJDK 17 image with Alpine Linux
#FROM openjdk:17-jdk-alpine
#LABEL authors="sayed.ahammed"
#COPY target/product-server-0.0.1-SNAPSHOT.jar product-server-1.0.0.jar
#ENTRYPOINT ["java", "-jar", "/product-server-1.0.0.jar"]

