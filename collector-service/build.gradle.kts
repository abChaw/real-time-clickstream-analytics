plugins {
    // Versions are centralized in buildSrc/Versions.kt for type‑safety
    id("org.springframework.boot") version "3.3.0" apply false
    id("io.spring.dependency-management") version "1.1.5" apply false
   // kotlin("jvm") version Versions.kotlin apply false // build‑script only, not app runtime
    java
}

allprojects {
    group = "com.example.clickstream"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    // Configure Java toolchain once for all modules
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
    }
}