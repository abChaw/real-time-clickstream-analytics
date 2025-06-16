pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "clickstream-platform"

include("collector-service", "stream-service")