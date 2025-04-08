plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/poseidon.jar"))
    implementation("org.json:json:20210307")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")
}