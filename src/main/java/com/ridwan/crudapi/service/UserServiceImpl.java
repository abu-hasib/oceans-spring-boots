package com.ridwan.crudapi.service;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ridwan.crudapi.user.User;

@Service
public class UserServiceImpl implements UserService {
	Map<String, User> users;
	
	@Override
	public List<User> getUsers() {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		users.add(new User(UUID.randomUUID().toString(), "Lekki", "password", "mail@mail.com"));
		
		return users;
	}
	
	@Override
	public User createUser(User user) {
		
		User createdUser = new User(null, null, null, null);
		createdUser.setUserName(user.getUserName());
		createdUser.setPassword(user.getPassword());
		createdUser.setEmail(user.getEmail());
		String userId = UUID.randomUUID().toString();
		createdUser.setUserId(userId);
		
		if (users == null) {
			users = new HashMap<>();
		}
		users.put(userId, createdUser);
		return createdUser;
	}	
}