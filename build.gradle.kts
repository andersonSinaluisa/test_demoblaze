plugins {
    id("java")
}

group = "org.andersonsinaluisa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:7.0.0")
    testImplementation("io.cucumber:cucumber-junit:7.0.0")
    testImplementation("net.serenity-bdd:serenity-core:3.8.0")
    testImplementation("net.serenity-bdd:serenity-cucumber5:3.8.0")

}

tasks.test {
    useJUnitPlatform()
}