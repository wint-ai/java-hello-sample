plugins {
    java
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("com.google.cloud.tools.jib") version "3.3.1"
}

group = "ai.wint"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val appMainClassName = "ai.wint.javasample.JavaSampleApplication"

jib {
    from {
        image = "eclipse-temurin:17"
    }
    to {
        image = "java-sample:latest"
    }
    container {
        mainClass = appMainClassName
        labels.put("company", "wint")
        labels.put("subject", project.name)
        format = com.google.cloud.tools.jib.api.buildplan.ImageFormat.OCI
    }
}
