# Sample application

## Description

This is a sample application for the [Spring Boot](https://spring.io/projects/spring-boot) framework.
It is a simple REST API with endpoint:

* `GET /hello` - returns a JSON object with a greeting message and the application environment name.
  example:

> {"msg":"Hello World!","env":"prod"}

Environment variable can be set to change the application environment name: SPRING_PROFILES_ACTIVE=prod

Project contains tests, the test report is generated in `build/test-results` in xml format.

Service is configured to listen on port 8090.

## Requirements
* Java 17
* Docker

## How to build and start

1. > git clone https://github.com/wint-ai/java-hello-sample.git
2. > cd java-hello-sample
3. > ./gradlew build
4. > java -jar build/libs/java-hello-sample-1.0.0.jar

## Docker image
Image can be built with the command:
> ./gradlew jibDockerBuild

The command will create the image in the local Docker registry.

Also, repository contains Dockerfile to build the image.
