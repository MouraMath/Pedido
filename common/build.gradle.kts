plugins {
	`java-library`

}

dependencies {
	api("org.springframework:spring-web")
	api("com.fasterxml.jackson.core:jackson-databind")
	api("jakarta.persistence:jakarta.persistence-api")

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
}
