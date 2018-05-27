# SpringBootApps
Spring Boot Applications


# To generate deployment JARS run below command in project root directory 
> mvn clean install 

# JAR will be found under /target folder

# To run JAR file, run below command
> java -jar target/course-api-data-0.0.1-SNAPSHOT.jar


# If you want to dploy war file just change packaging in pom.xml

<packaging>war</packaging>
> mvn clean install

# WAR will be found under /target folder


# Project monitoring will be enabled by adding below dependency in pom.xml

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

# These are a group of binaries added to the classpath, which enables few features.
# This add an endpoint to our project, which tells us about the project stats

http://localhost:8080/health 
{
    "status": "UP"
}

# To run the actuator on a different port add below entry to application.properties file
management.port=9090

http://localhost:9090/health 
{
    "status": "UP"
}

