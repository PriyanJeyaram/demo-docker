FROM openjdk
LABEL maintainer = "imtheclient@clienthub.com"
EXPOSE 8092
WORKDIR /app
COPY target/demoDocker.jar /app/demoDocker.jar
ENTRYPOINT ["java", "-jar", "demoDocker.jar"]