FROM openjdk:17-oracle

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} quizservice.jar

ENTRYPOINT ["java", "-jar", "/quizservice.jar"]

EXPOSE 8083