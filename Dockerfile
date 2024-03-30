FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/demo-airflow-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","demo-airflow-0.0.1-SNAPSHOT.jar"]