package com.aprendendospringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aprendendospringdatajpa.model.User;
import com.aprendendospringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	@Autowired
	private User user;
	
	@Override
	public void run(String... args) throws Exception {
		
		user.setName("Carlos");
		user.setUsername("caducarlos");
		user.setPassword("aaaa1111");
		
		repository.save(user);
		
		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}

}
