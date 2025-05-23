package com.gauravcompany.nl_sb_base_assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NlSbBaseAssignmentApplication {
    private static final Logger logger = LogManager.getLogger(NlSbBaseAssignmentApplication.class);
	// This is the main entry point for the Spring Boot application.
	// It uses the SpringApplication.run() method to launch the application.
	// The @SpringBootApplication annotation is a convenience annotation that adds
	// the @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations.
	// It enables auto-configuration and component scanning for the application.
	// The main method is the entry point of the Java application.
	// It is the method that is called when the application is started.

	// -DskipTests -Dcheckstyle.skip -Dpmd.skip -Dspotbugs.skip
	// http://localhost:8080/v3/api-docs
	// save the swagger.json file and import it into Postman and 
	// then convert it to a collection and then save it in test folder
	// http://localhost:8080/swagger-ui/index.html
	// mvn dependency:tree >> aa.txt
	public static void main(String[] args) {
		var context = SpringApplication.run(NlSbBaseAssignmentApplication.class, args);
		var env = context.getEnvironment();
		String appName = env.getProperty("spring.application.name", "Application");
		String port = env.getProperty("server.port", "8080");
		String localUrl = "http://localhost:" + port;
        String[] profiles = env.getActiveProfiles();
        String profileInfo = profiles.length > 0 ? String.join(", ", profiles) : "default";
        logger.info("--------------------------------------------------------------");
        logger.info("\tApplication '{}' is running!", appName);
        logger.info("\t------------------------------------------------------");
        logger.info("\tUrl:      \t{}", localUrl);
        logger.info("\tProfile(s): \t{}", profileInfo);
        logger.info("--------------------------------------------------------------");
	}

}
