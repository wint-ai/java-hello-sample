# Sample application

## Description

This is a sample application for the [Spring Boot](https://spring.io/projects/spring-boot) framework.
It is a simple REST API with endpoint:

* `GET /hello` - returns a JSON object with a greeting message and the environment name.
  example:

> {"msg":"Hello World!","env":"prod"}

Environment variable can be set to change the environment name: SPRING_PROFILES_ACTIVE=prod

Project contains tests, test report is generated in `build/test-results` in xml format.

## Requirements

* Java 17

## How to build and start

1. > git clone https://github.com/wint-ai/java-hello-sample.git
2. > cd java-hello-sample
3. > ./gradlew build
4. > java -jar build/libs/java-hello-sample-1.0.0.jar