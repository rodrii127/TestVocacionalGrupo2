package com.example.demo.config;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket ipaApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controllers"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metadata())
		        .securitySchemes(Arrays.asList(apiKey()));
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder()
				.title("Spring Boot REST Alumnos")
				.description("\"Spring Boot REST Test Vocacional\"")
				.version("1.0.0")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
				.contact(new Contact("Rodrigo", "", "rodriguezrodrigo127@gmail.com"))
				.build();		
	}	
	private ApiKey apiKey() {
	    return new ApiKey("Authorization", "Authorization", "header");
	}
}
