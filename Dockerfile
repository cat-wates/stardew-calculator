# slim version, has utility packages
FROM eclipse-temurin:21-jdk
LABEL authors="Catherine.Wates"

#copies Gradle files to the image
COPY ./gradle/wrapper ./gradle/wrapper
COPY ./gradlew .
COPY ./settings.gradle.kts .

#runs gradle wrapper
RUN ./gradlew

#copies the rest of the project files to the image
COPY .  .

#runs Gradle tasks to clean, test & build the application
RUN ./gradlew clean test build

#specifies the command to run the application using the built JAR file
CMD ["java", "-jar", "build/libs/stardew-calculator-1.0-SNAPSHOT.jar"]


