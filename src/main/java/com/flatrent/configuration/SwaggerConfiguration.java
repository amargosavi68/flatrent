package com.flatrent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
					.components(new Components())
					.info(new Info()
						.title("FlatRent API")
						.description("A Spring Boot RESTful service for FlatRent App.")
						.version("1.0")
						.contact(new Contact()
							.name("Amar Gosavi")
							.email("amar.gosavi@gmail.com")
							.url("www.amargosavi.in")));
	}
}
