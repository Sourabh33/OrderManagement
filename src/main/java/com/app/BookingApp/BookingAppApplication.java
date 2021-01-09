package com.app.BookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.util.UriComponentsBuilder;

//@SpringBootApplication
public class BookingAppApplication {

	public static void main(String[] args) {
		String string = UriComponentsBuilder.fromUriString("TEST")
				.queryParam("user", "username")
				.queryParam("password", "password")
				.queryParam("port", 22)
				.queryParam("host", "host")
				.build().toString();
		System.out.println(string);
//		SpringApplication.run(BookingAppApplication.class, args);
	}

}
