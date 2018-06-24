package io.home.springbootmvc.SpringBootWebApp.service;

import io.home.springbootmvc.SpringBootWebApp.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
}
