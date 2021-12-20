FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/book-service
COPY . /opt/book-service
RUN mvn clean install 

# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=book-service.jar

WORKDIR /opt/book-service

COPY --from=maven /opt/book-service/target/${JAR_FILE} /opt/book-service/

ENTRYPOINT ["java","-jar","book-service.jar"]