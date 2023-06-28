package com.studantkaio.myprojectweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectWebApplication {

	public static void main(String[] args) {
		System.out.println("My first program is up now");
		SpringApplication.run(MyProjectWebApplication.class, args);
	}

}
