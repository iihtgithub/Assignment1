package com.assignment.dao;

import java.util.List;

import com.assignment.entity.User;


public interface UserDAO {
	
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(Long id);
	public List<User> getAllUsers();
	public boolean deleteAllUsers();

}
