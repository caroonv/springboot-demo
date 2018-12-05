FROM maven:3.5.4-jdk-8-alpine
WORKDIR /usr/src/java-code
COPY . /usr/src/java-code/
RUN mvn package

WORKDIR /usr/src/java-app
RUN cp /usr/src/java-code/target/*.jar ./demo.jar
EXPOSE 9000
CMD ["java", "-jar", "demo.jar"]