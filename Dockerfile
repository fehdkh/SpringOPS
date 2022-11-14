FROM alpine
RUN apk add openjdk11
EXPOSE 8080
CMD "java"
