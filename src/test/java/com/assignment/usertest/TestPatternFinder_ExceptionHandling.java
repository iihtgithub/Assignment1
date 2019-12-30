package com.assignment.usertest;

import org.junit.Assert;
import org.junit.Test;

import com.assignment.common.AssignmentException;
import com.assignment.dao.UserDAO;
import com.assignment.dao.UserDaoImpl;


public class TestPatternFinder_ExceptionHandling {
	UserDAO userDao = new UserDaoImpl();
	
	@Test(expected=AssignmentException.class)
    public void testFindNoOfOccurrences1Boundary() throws Exception{
        Long input = 105l;
        /**
         * Whether the implementation provides reads user with id is not exist
         * in case user wth id does not exist it will throw Exception 
         */
        userDao.deleteUser(input);
    }
}
