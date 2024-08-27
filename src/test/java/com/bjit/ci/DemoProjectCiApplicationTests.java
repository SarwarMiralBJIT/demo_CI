package com.bjit.ci;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoProjectCiApplicationTests {

	static Logger logger = LoggerFactory.getLogger(DemoProjectCiApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("It's a test class");
		assertEquals(true, true);
	}

}
