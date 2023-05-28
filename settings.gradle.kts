pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Garage"
include(":Garage")
include(":shared")