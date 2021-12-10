package com.exam.service;

import java.util.Set;

import com.exam.entity.User;
import com.exam.entity.UserRole;

public interface UserService {
	
	//creates user using user and userRoles
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	//Get user by username
	public User getUser(String username);
	
	//delete user by id
	public void deleteUser(Long userId);
}
