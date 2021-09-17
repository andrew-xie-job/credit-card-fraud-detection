FROM adoptopenjdk/openjdk8
ENV APP_HOME=/usr/app/
WORKDIR /usr/app/ .
COPY build/libs/*.jar app.jar app.jar.
Expose 8080
CMD [“java”, “-jar”, “app.jar”]
