FROM eclipse-temurin:23-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew /app/
COPY build.gradle settings.gradle /app/
COPY gradle /app/gradle

# Add execute permission to gradlew
RUN chmod +x /app/gradlew

# Pre-download dependencies
RUN ./gradlew build --no-daemon || true

# Expose application port
EXPOSE 8080

# Run Spring Boot application
CMD ["sh", "-c", "./gradlew bootRun --no-daemon"]
