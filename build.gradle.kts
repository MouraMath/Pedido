plugins {
    java
    id("org.springframework.boot") version "3.4.4" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
}

allprojects {
    group = "dev"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    dependencies {

        implementation(platform("org.springframework.boot:spring-boot-dependencies:3.4.4"))
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
