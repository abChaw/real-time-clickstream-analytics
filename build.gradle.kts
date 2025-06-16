plugins {
    // ↓ hard-code versions here – constants are OK later, just not in this block
    id("org.springframework.boot") version "3.3.0" apply false
    id("io.spring.dependency-management") version "1.1.5" apply false
   // kotlin(/**/"jvm") version "1.9.23" apply false   // Kotlin only for build scripts
    java
}

allprojects {
    group = "com.example.clickstream"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}