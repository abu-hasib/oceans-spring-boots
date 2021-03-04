package com.ridwan.crudapi.service;

import java.util.Collection;

import com.ridwan.crudapi.user.User;

public interface UserService {
	User createUser(User user);
	
	Collection<User> getUsers();
}