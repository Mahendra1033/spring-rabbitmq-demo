FROM openjdk:8
EXPOSE 5510
ADD target/spring-rabbimq-example.jar spring-rabbimq-example/jar
EXPOSE ["java","-jar","/spring-rabbimq-example.jar"]