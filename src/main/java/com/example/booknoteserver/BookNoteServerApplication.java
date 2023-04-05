package com.example.booknoteserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
