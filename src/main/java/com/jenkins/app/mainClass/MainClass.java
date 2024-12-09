package com.jenkins.app.mainClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
	
	public static Logger log=LoggerFactory.getLogger(MainClass.class);
	
	public void chechStatus() {
		
		System.out.println("Connection created :: ALL GOOD");
		
		log.debug("Connectiion Created successfully");
	}
	
}
