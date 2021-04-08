package com.app.bak.service;

import java.util.List;

import com.app.bak.model.User;
import com.app.bak.util.ResponseStatus;

public interface UserService {
	
	public List<User> getUserList();

	public User getUser(int id);
	
	public User getUserByUserId(String userId);

	public ResponseStatus addUser(User user);

	public ResponseStatus updateUser(User user);

	public ResponseStatus deleteUser(int id);

}
