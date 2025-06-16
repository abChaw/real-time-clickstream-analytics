// ===========================
// clickstream-platform/build.gradle.kts
// ===========================

plugins {
    // ↓  plain strings only – Gradle hasn’t compiled buildSrc yet
    id("org.springframework.boot") version "3.3.0" apply false
    id("io.spring.dependency-management") version "1.1.5" apply false
    // No Kotlin plugin needed because the app code is pure Java
}

allprojects {
    group = "com.example.clickstream"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    // Apply the Java tool-chain ONLY where the Java plugin is present
    plugins.withId("java") {
        the<JavaPluginExtension>().apply {
            toolchain.languageVersion.set(JavaLanguageVersion.of(23))
        }
    }
}
