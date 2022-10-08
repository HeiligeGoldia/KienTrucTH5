FROM openjdk:16-jdk-alpine
COPY target/th04-0.0.1-SNAPSHOT.jar th04-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/th04-0.0.1-SNAPSHOT.jar"]