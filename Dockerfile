FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at the defined working directory
COPY target/spring-mysql-docker-image-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port the app runs on
EXPOSE 8081

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]