@Suppress("DSL_SCOPE_VIOLATION") // https://youtrack.jetbrains.com/issue/KTIJ-19369

// the plugins block lets us define which gradle plugins we want to use
plugins {
    // base java plugin tells gradle we want to use java in our project
    java
    // application plugin lets us run the main method via gradle task "run"
    application
    id("org.openjfx.javafxplugin") version "0.0.13"
}

version = "0.1.0-SNAPSHOT"

// repositories define the places from which we want to download libraries
repositories {
    // maven central is the default repository for gradle plugins
    mavenCentral()
}

// dependencies define which libraries we want to download and include in our project
dependencies {
    // in order to use @NotNull and @Nullable annotations, we need to add the javax.annotations plugin
    implementation("org.jetbrains:annotations:23.0.0")
    // for executing unit tests, we need to add the junit plugin
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

// the java block lets us define the java version we want to use
java {
    // The source compatibility level is the minimum version of Java that we want to support for compilation
    // so basically the Version that the source code is written in
    sourceCompatibility = JavaVersion.VERSION_17
    // The target compatibility level is the minimum version of Java that we want to support for execution
    targetCompatibility = JavaVersion.VERSION_17
}

// The application block lets us define the main class we want to run
// configure the application plugin, tell gradle where to look for our main method
// to run the project, use the gradle task "run"
// this may be done via your IDE or in the command line as either:
// Unix, Powershell: "./gradlew run"
// CMD: "gradlew run"
application {
    // The main class is the class that will be executed when we execute the gradle task "run"
    // in our case the main class is called "MainApp" and is part of the package "javafx_playground"
    mainClass.set("javafx_playground.MainApp")
}

// the javaFX block lets us define the javaFX version and the modules we want to use
javafx {
    // The version of JavaFX we want to use
    version = "17.0.1"
    // The modules we want to use
    modules("javafx.controls", "javafx.fxml", "javafx.swing", "javafx.graphics", "javafx.base")
}

// the tasks block lets us define the tasks we want to use
tasks {
    // Here we ensure that the UTF-8 encoding is used for all files
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
