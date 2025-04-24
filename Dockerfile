# slim version, has utility packages
FROM openjdk:17-slim
LABEL authors="Catherine.Wates"

COPY ./gradle/wrapper ./gradle/wrapper
COPY ./gradlew .
COPY ./settings.gradle.kts .

RUN ./gradlew

COPY .  .

RUN ./gradlew clean test build

CMD ["java", "-jar", "build/libs/stardew-calculator-1.0-SNAPSHOT.jar"]


