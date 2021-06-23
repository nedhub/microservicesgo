package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication {

	@RestController
	class WebApp{
		@GetMapping("/")
		String welcome() {
			"<h1>Spring boot rocks</h1>"
		}
	}

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}

}
