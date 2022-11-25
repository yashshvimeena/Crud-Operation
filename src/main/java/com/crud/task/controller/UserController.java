package com.crud.task.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	 
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User>  getAllUsers(){
		return userService.getALLUser();
	}
	
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable String id){
		return userService.getOneUser(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, value ="/users")
	public void adduser(@RequestBody User user) {
		userService.addAuser(user);
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable String id) {
		userService.UpdateUser(id,user);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/users/{id}")
	public void DeleteTopic(@PathVariable String id) {
		userService.DeleteTheTopic(id);
	}
	
	
}
