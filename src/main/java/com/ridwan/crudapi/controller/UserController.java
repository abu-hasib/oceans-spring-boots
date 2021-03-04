package com.ridwan.crudapi.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ridwan.crudapi.service.UserService;
import com.ridwan.crudapi.user.User;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<Collection<User>> getUsers() {

		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		return new ResponseEntity<>(userService.createUser(user), HttpStatus.OK);
	}
}
