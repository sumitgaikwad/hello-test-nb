package com.springtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHelloworldApplication {

        @RequestMapping("/hello")
        String home(){
            return "Hello World of Spring Boot 11";
        }
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}

}
