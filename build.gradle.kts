plugins {
    java
    application
    id("org.sourcegrade.style") version "2.0.0"
    id("org.openjfx.javafxplugin") version "0.0.13"
}

version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:23.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("javafx_playground.Main")
}

javafx {
    version = "17.0.1"
    modules = listOf("javafx.controls")
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
