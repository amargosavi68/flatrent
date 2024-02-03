package com.flatrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.Operation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class FlatrentApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlatrentApplication.class, args);
	}
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Request {
	private String name;
	private String description;
	private Double salary;
}

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
class A {
	@GetMapping 
	public String getUser() {
		return new String();
	}
	
	@PostMapping(consumes = "application/json")
	@Operation(description = "create url")
	public ResponseEntity<Request> postMapping(@org.springframework.web.bind.annotation.RequestBody Request rq) {
		log.info(rq.toString());
		return ResponseEntity.status(HttpStatus.OK).body(rq);
	}
}
