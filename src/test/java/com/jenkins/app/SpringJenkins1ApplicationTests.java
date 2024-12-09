package com.jenkins.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins1ApplicationTests {
	
	public static Logger log=LoggerFactory.getLogger(SpringJenkins1ApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test Case Executed ");
		assertEquals(true, true);
	}

}
