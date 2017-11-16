package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
@SpringBootApplication(scanBasePackages = {"com"})  
@EntityScan("com.example.Entity")
@EnableJpaRepositories("com.example.Repository")
public class LoginApplication {
	
	@RequestMapping("/gg")
	String hello() {
		return "hhhhh";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}
}
