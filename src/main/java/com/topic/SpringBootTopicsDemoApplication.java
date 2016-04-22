package com.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan("com.topic")
@Configuration
public class SpringBootTopicsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTopicsDemoApplication.class, args);
	}
}
