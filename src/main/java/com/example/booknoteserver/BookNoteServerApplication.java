package com.example.booknoteserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BookNoteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNoteServerApplication.class, args);
		System.out.println("Hello wol");
		greet();
	}

	private static String greet() {
		return "hello world";
	}

	public WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("*");
			}
		};
	}
}
