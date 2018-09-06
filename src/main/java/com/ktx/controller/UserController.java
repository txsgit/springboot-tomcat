package com.ktx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktx.domain.User;

@RestController
public class UserController {

	
	@RequestMapping("/userInfo")
	public String userInfo()
	{
		User u=new User();
		u.setId(11l);
		return "test";
	}
}
