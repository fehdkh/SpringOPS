FROM openjdk:11
COPY ./target/*.jar achat-1.0.jar
CMD ["java","-jar","achat-1.0.jar"]
EXPOSE 8080
