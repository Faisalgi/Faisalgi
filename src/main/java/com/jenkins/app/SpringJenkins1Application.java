package com.jenkins.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jenkins.app.mainClass.MainClass;

@SpringBootApplication
public class SpringJenkins1Application {

public static Logger log=LoggerFactory.getLogger(SpringJenkins1Application.class);

 static MainClass cls=new MainClass();
	
	public static void main(String[] args) {
		log.info("Started ::");
		System.out.println(" Started ::-");
		cls.chechStatus();
		SpringApplication.run(SpringJenkins1Application.class, args);
	}

}
