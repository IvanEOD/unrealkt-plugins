rootProject.name = "unrealkt"

pluginManagement {
    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion

        id("com.gradle.plugin-publish") version "1.2.0"
    }

}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

}

include(":unrealkt-gradle-plugin")
