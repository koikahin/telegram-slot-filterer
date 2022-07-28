import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("org.drinkless.tdlib.example.Main")
    applicationDefaultJvmArgs = listOf("-Djava.library.path=tdlib/bin")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
