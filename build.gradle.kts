plugins {
    id("java")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "uk.co.stardewcalculator.Main"
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //JUnit
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    //AssertJ
    testImplementation("org.assertj:assertj-core:3.4.1")

    //Mockito
    testImplementation("org.mockito:mockito-core:5.12.0")
}

tasks.test {
    useJUnitPlatform()
}