package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	
	@GetMapping("sample")
	@CrossOrigin(origins = "http://localhost:4201")
	public String sampleEndpoint() {
		return "Sample Get.";
	}
	
	@PostMapping("samplepost")
	@CrossOrigin(origins = "http://localhost:4201")
	public String samplePostEndpoint(@RequestBody String name) {
		return "Hello"+name;
	}

}
