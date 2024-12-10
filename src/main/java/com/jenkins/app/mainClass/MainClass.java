package com.jenkins.app.mainClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
	
	static Logger log= LoggerFactory.getLogger(MainClass.class);
	
	public void checkFlow() {
		System.out.println("Started :: ");
		log.info("Started checkFlow method ");
	}
}
