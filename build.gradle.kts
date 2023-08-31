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
    implementation("net.serenity-bdd:serenity-core:4.0.0-beta-6")
    testImplementation("net.serenity-bdd:serenity-cucumber:4.0.0-beta-6")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    compileOnly("org.projectlombok:lombok:1.18.28")

}

tasks.test {
    useJUnitPlatform()
}