package com.assignment.dao;

import java.util.List;
import java.util.logging.Logger;

import org.junit.platform.commons.logging.LoggerFactory;

import com.assignment.entity.User;


/**
 * Manager for persisting and searching on Users. Uses JPA.
 */

public class UserDaoImpl implements UserDAO{
	private static final Logger LOG = Logger.getLogger(UserDaoImpl.class.getName());
	/**
     * Add a User to the Database.
     * Throw AssignmentException Exception with Message 'User Already Exit with This Id' in case user with Id Is already exist Exception in case user with Id Is already exist 
     */
	public boolean addUser(User user) {
		LOG.info("Adding User : " + user);
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * Update a User to the Database.
     * Throw AssignmentException Exception  with Message 'User Not Exit with This Id' with Id Is not exist
     */
	public boolean updateUser(User user) {
		LOG.info("Update User : " + user);
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * Delete a User to the Database.
     * Throw AssignmentException Exception  with Message 'User Not Exit with This Id' with Id Is not already exist
     * 
     */
	public boolean deleteUser(Long id) {
		LOG.info("Deleting User : " + id);
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * List all Users from the Database.
     * Throw AssignmentException Exception with Message "Empty User List" in case user list is empty
     */
	public List<User> getAllUsers() {
		LOG.info("List All Books");
        LOG.info("------------------------------------------");
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Delete all Users from the Database.
     * Throw AssignmentException Exception with Message "Empty User List" in case user records is Empty
     */
	public boolean deleteAllUsers() {
		 LOG.info("Deleting Users...-");
		// TODO Auto-generated method stub
		return false;
	}
	

    

}
