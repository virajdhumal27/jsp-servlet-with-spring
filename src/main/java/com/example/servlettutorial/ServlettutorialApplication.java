package com.example.servlettutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServlettutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServlettutorialApplication.class, args);
	}

}
