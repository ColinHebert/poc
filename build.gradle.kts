plugins {
    kotlin("jvm") version "1.1.51"
    id("org.junit.platform.gradle.plugin") version "1.0.1"
}

junitPlatform {
    filters {
        engines {
            include("junit-jupiter", "junit-vintage", "spek")
        }
    }
}

dependencies {
    compile(kotlin("stdlib"))
    compile(kotlin("reflect"))

    testCompile("org.jetbrains.spek", "spek-api", "1.1.5")
    testCompile("org.junit.jupiter", "junit-jupiter-api", "5.+")
    testCompile("junit", "junit", "4.+")
    testCompile("com.natpryce", "hamkrest", "1.+")
    testCompile("org.mockito", "mockito-inline", "2.+")

    testRuntime("org.jetbrains.spek", "spek-junit-platform-engine", "1.1.5")
    testRuntime("org.junit.jupiter", "junit-jupiter-engine", "5.+")
    testRuntime("org.junit.vintage", "junit-vintage-engine", "4.+")
}

repositories {
    mavenCentral()
    jcenter()
}
