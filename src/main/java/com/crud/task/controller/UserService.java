package com.crud.task.controller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
//	private List<Topic> users = new ArrayList<>( Arrays.asList(
//			new Topic("Java","Yashshvi","Intern"),
//			new Topic("Python","Bhwana","Student"),
//			new Topic("C","Mahi","Intern")
//			));
	
	public List<User> getALLUser(){
		//return users;
		List<User> users = new ArrayList<>();
		userRepository.findAll().
		forEach(users::add);
		return users;
	}
	public  Optional<User> getOneUser(String id) {
		//return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return userRepository.findById(id);
	}
	public void addAuser(User user) {
		//topics.add(user);
		userRepository.save(user);
	}

	public void UpdateUser(String id, User user){
		userRepository.save(user);
//		for(int i =0;i<users.size();i++) {
//			User t = users.get(i);
//			if(t.getId().equals(id)) {
//				users.set(i, user);
//				return;
//			}
//		}

	}
	public void DeleteTheTopic(String id) {
		//users.removeIf(t -> t.getId().equals(id));
	    userRepository.deleteById(id);
	}
	
}
