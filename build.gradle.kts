import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.5.3"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.5.21"
  kotlin("plugin.spring") version "1.5.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
  mavenLocal()
  maven("https://maven.aliyun.com/repository/public")
  maven("https://maven.aliyun.com/repositories/jcenter")
  maven("https://maven.aliyun.com/repositories/google")
  maven("https://maven.aliyun.com/repository/central")
  maven("https://mymavenrepo.com/repo/NG5nXebriggSe1uO02cv/")
}

val swaggerVersion = "3.0.0"

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

  implementation("io.springfox:springfox-boot-starter:$swaggerVersion")
  implementation("io.springfox:springfox-bean-validators:$swaggerVersion")

  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "11"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
