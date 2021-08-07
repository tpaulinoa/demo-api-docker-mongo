FROM adoptopenjdk/openjdk11:latest
WORKDIR /app
COPY ./build/libs/*.jar ./app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
EXPOSE 8080
