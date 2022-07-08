package com.sachin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBasicApplication.class, args);
		
		Hello hello = ctx.getBean(Hello.class);
		
		hello.sayHello();
	}

}
