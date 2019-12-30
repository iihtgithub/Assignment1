package com.assignment.usertest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.assignment.dao.UserDAO;
import com.assignment.dao.UserDaoImpl;
import com.assignment.entity.User;


public class TestPatternFinder_Boundary {
	
	    
	UserDAO userDao = new UserDaoImpl();


	    
	    @Test
	    public void testFindNoOfUsersBeforeInsert1Boundary() throws Exception{
	    	
	        /**
	         * Whether the implementation provides reads the right no of users
	         */
	        Integer noOfRecord = userDao.getAllUsers()!=null?userDao.getAllUsers().size():0;
	         Assert.assertEquals(noOfRecord, new Integer(0));
	        
	      
	        
	    }
	    
	    @Test
	    public void testFindNoOfUsersAfterInsert() throws Exception{
	    	userDao.deleteAllUsers();
	    	userDao.addUser(new User(101l,"Ram","Sharma"));
	    	userDao.addUser(new User(102l,"Shyam","Varma"));
	    	userDao.addUser(new User(103l,"Ram","Sharma"));
	        /**
	         * Whether the implementation provides reads the right no of users
	         */
	        Integer noOfRecord = userDao.getAllUsers()!=null?userDao.getAllUsers().size():0;
	         Assert.assertEquals(noOfRecord, new Integer(3));
	        
	      
	        
	    }
	    
	    
}
