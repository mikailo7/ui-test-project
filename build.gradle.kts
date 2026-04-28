plugins {
    kotlin("jvm") version "2.3.0"
}

repositories {
    mavenCentral()
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
    maven("https://www.jetbrains.com/intellij-repository/releases")
    maven("https://download.jetbrains.com/teamcity-repository")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation("com.jetbrains.intellij.tools:ide-starter-squashed:241.15989.150")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}