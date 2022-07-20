package com.sergedanson.swaggercrashcourse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Spring boot API with Swagger", version = "1.0", description = "Spring boot API with Open API Specification"),
		servers = {@Server(url = "localhost:8080"), @Server(url = "https://sergedanson.com") },
		tags = {@Tag(name="TodoItems", description = "Todo items")}

)
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}

}
