FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY target/*.jar springbootk8sdemo.jar
ENTRYPOINT ["java", "-jar", "springbootk8sdemo.jar"]
