plugins {
    id("java")
    id("application")
    id("com.github.ben-manes.versions") version "0.51.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass.set("app.Application")
}

tasks.test {
    useJUnitPlatform()
}
