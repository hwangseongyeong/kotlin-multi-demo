import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val projectGroup: String by project
val applicationVersion: String by project

plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.spring") apply false
    kotlin("plugin.jpa") apply false
    id("org.springframework.boot") apply false
    id("io.spring.dependency-management")
    id("org.asciidoctor.jvm.convert") apply false
    id("org.jmailen.kotlinter") apply false
    id("groovy")
}

java.sourceCompatibility = JavaVersion.VERSION_11

allprojects {
    group = projectGroup
    version = applicationVersion

    repositories {
        mavenCentral()
    }

    configurations {
        all {
            exclude(group = "org.junit.vintage")
        }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.kapt")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.asciidoctor.jvm.convert")
    apply(plugin = "org.jmailen.kotlinter")

    dependencyManagement {
        val springCloudDependenciesVersion: String by project
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudDependenciesVersion")
        }
    }

    val springMockkVersion: String by project
    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("io.kotest:kotest-assertions-core-jvm:4.4.3")
        testImplementation("io.kotest:kotest-extensions-spring:4.4.3")
        testImplementation("org.spockframework:spock-core:2.0-groovy-2.5")
        testImplementation("org.spockframework:spock-spring:2.0-groovy-2.5")
        testImplementation("com.ninja-squad:springmockk:$springMockkVersion")
        annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

        kapt("org.springframework.boot:spring-boot-configuration-processor")
    }

    tasks.getByName("bootJar") {
        version = System.getenv("VERSION") ?: project.version
        enabled = false
    }

    tasks.getByName("jar") {
        enabled = true
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform() {
            excludeTags("develop", "restdocs")
        }
    }

    tasks.register<Test>("restDocsTest") {
        group = "verification"
        useJUnitPlatform {
            includeTags("restdocs")
        }
    }

    tasks.getByName("asciidoctor") {
        dependsOn("restDocsTest")
    }

    tasks.getByName("clean") {
        delete("out")
    }
}
