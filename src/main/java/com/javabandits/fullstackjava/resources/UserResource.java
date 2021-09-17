package com.javabandits.fullstackjava.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.javabandits.fullstackjava.model.User;
import com.javabandits.fullstackjava.services.UserService;

@RestController
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/User/addUser")
	public boolean addProduct(@RequestBody User user) {
		System.out.println("Request to add user reached!");
		return userService.addUser(user);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/User/{id}")
	public User getUser(@PathVariable("id") int id) {
		System.out.println("Request to fetch user reached");
		return userService.getUser(id);
	}

}
