package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import com.dummy.test.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dummy.test"})
public class Day12BootRestExceptionApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(Day12BootRestExceptionApplication.class, args);
		String beans[] = context.getBeanDefinitionNames();
		for(String bean:beans)
		{
			System.out.println(bean);
		}
	}

}
