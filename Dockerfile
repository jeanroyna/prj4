FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} prj4.jar
ENTRYPOINT ["java","-jar","/prj4.jar"]
