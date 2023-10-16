import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.8.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("org.example.BTreeBotKt")
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/dev.robocode.tankroyale/robocode-tankroyale-bot-api
    implementation("dev.robocode.tankroyale:robocode-tankroyale-bot-api:0.19.2")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<ShadowJar> {
    archiveFileName.set("BTreeBot.jar")

    doLast {
        copy {
            from("src/main/kotlin/org/example/BTreeBot.json")
            from("build/libs/BTreeBot.jar")
            into("BTreeBot")
        }
    }

}

tasks.clean {
    delete ("BTreeBot/BTreeBot.json")
    delete ("BTreeBot/BTreeBot.jar")
}

kotlin {
    jvmToolchain(11)
}
