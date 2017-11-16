package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService user;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		if(user.login("test", "test")==1)
			return "success";
		return "hello";
	}
	

}
