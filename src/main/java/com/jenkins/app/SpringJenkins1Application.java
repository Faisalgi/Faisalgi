
package com.jenkins.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jenkins.app.mainClass.MainClass;


@SpringBootApplication
public class SpringJenkins1Application {

 static Logger log=LoggerFactory.getLogger(SpringJenkins1Application.class);

 	static MainClass mclass=new MainClass();
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkins1Application.class, args);
		mclass.checkFlow();
	}

}
