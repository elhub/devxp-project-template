rootProject.name = "your-project-name"

pluginManagement {
    repositories {
        maven(url = "https://jfrog.elhub.cloud:443/artifactory/elhub-plugins")
    }
}

dependencyResolutionManagement {
    repositories {
        maven("https://jfrog.elhub.cloud:443/artifactory/elhub-mvn")
    }
}
