package com.bjit.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoProjectCiApplication {

	static Logger logger = LoggerFactory.getLogger(DemoProjectCiApplication.class);

	public static void main(String[] args) {
		logger.info("Job is running...");
		SpringApplication.run(DemoProjectCiApplication.class, args);
	}
}
