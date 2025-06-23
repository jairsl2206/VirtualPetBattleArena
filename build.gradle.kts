plugins {
    id("org.springframework.boot") version "3.2.5" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
}

subprojects {
    apply(plugin = "java")
    group = "com.virtualpet"
    version = "0.1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}
