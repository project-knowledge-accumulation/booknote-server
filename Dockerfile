# Backend Dockerfile
FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY ./book-note-server/target/book-note-server.jar /app
CMD ["java", "-jar", "book-note-server.jar"]
EXPOSE 8080
