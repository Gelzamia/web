package com.Web.RequestHandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class RequestHandlerApplication {

	public static void main(String[] args) {
		 //ааааааааааааааааааааааааааааааааа
		SpringApplication.run(RequestHandlerApplication.class, args);
	}
	@GetMapping("/simple-request")
	public String simpleRequest() {
		return "ok";
	}

}
