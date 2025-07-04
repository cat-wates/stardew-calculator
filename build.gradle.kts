plugins {
    id("java")
    id("org.springframework.boot") version "3.4.3" //sets the Spring Boot version
    id("io.spring.dependency-management") version "1.1.7"
    id("org.flywaydb.flyway") version "9.0.0"
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "uk.co.stardewcalculator.Application"
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

    //Spring-Web
    implementation("org.springframework.boot:spring-boot-starter-web")

    //Spring-Actuator
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    //Spring-Data
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    //DataJPATest
    implementation("org.springframework.boot:spring-boot-starter-test")

    //PostgreSQL
    implementation("org.postgresql:postgresql:42.7.2")

    //H2 Database
    implementation("com.h2database:h2:2.3.232")

    //Flyaway
    implementation("org.flywaydb:flyway-core")
    implementation("org.flywaydb:flyway-database-postgresql")

    //JDBI
    implementation("org.jdbi:jdbi3-core:3.48.0")
    implementation("org.jdbi:jdbi3-sqlobject:3.48.0")
}

flyway {
    url = "jdbc-url:postgresql://postgres:5432/stardewcalc"
    user = "postgres"
    password = "password"
}

tasks.test {
    useJUnitPlatform()
}