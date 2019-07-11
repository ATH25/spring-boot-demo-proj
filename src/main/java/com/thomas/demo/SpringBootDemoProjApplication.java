package com.thomas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootDemoProjApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBootDemoProjApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println("## "+ name);
		}
		
		 
	}

}

