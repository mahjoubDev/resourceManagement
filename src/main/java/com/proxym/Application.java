package com.proxym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan("com.proxym")
@EnableAutoConfiguration
public class Application {
	
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }

}
