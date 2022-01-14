package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUserService;
import com.example.demo.vo.User;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("selectALLUsers")
	public List<User> selectAllUsers(){
		return userService.selectALLUsers();
	}
}
