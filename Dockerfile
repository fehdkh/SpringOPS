FROM openjdk:11
COPY ./target/*.jar /target/docker
CMD ["java","-jar","achat-1.0.jar"]
EXPOSE 8080
