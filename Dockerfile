FROM eclipse-temurin:17

COPY build/libs/ /app

ENTRYPOINT ["java", "-jar", "/app/java-sample-1.0.0.jar"]