package com.assignment.usertest;

import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import com.assignment.dao.UserDAO;
import com.assignment.dao.UserDaoImpl;
import com.assignment.entity.User;


public class TestPatternFinder_Functional {
    static Properties properties = null;
    
    static{
        try {
            properties = TestUtil.getForProblem1();
        }
        catch(Exception e){
            //should never happen
            e.printStackTrace();
            System.out.println("here");
        }

    }
    
    UserDAO userDao = new UserDaoImpl();


    
    @Test
    public void testFindNoOfOccurrences1() throws Exception{
        String input = "Ram";
        /**
         * Whether the implementation provides reads the right no of occurrences
         */
        List<User> userList = userDao.getAllUsers();
        /**
         * Whether the test test giver is able to save information into database
         */
        String dataFromDatabase = userList.get(0).getFirstName();
        
        Assert.assertEquals(input, dataFromDatabase);
        
       
        
    }
    
    @Test
    public void testFindNoOfOccurrences2() throws Exception{
        
        List<User> userList = userDao.getAllUsers();
        Integer answer = Integer.parseInt((String)properties.get("testcase1"));
        Assert.assertEquals(""+userList.size(), answer.toString());
        
    }
    
    @Test
    public void testFindNoOfOccurrences3() throws Exception{
        Long input = 101l;
        userDao.deleteAllUsers();
        userDao.addUser(new User(101l,"Ram","Sharma"));
         Long answer = Long.parseLong((String)properties.get("testcase3"));
         Assert.assertEquals(input, answer);
        
    }
}
