# Stage 1: Build the app with Maven
FROM maven:3.8.7-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Run the app with JDK 17
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY --from=build /app/target/deploy1-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
