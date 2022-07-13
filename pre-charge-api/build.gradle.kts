plugins {
    id("groovy")
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":common:enum"))
    implementation(project(":common:util"))
    implementation(project(":storage:db-core"))
    implementation(project(":clients:client-example"))

    testImplementation(project(":tests:api-docs"))
    testImplementation("org.spockframework:spock-core:2.1-groovy-3.0")
    testImplementation("org.spockframework:spock-spring:2.1-groovy-3.0")

    implementation("org.springframework.boot:spring-boot-starter-web")
}
