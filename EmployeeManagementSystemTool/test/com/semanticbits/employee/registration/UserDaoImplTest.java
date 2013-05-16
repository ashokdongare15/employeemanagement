/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticbits.employee.registration;

import com.semanticbits.employee.Employee;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author dileep
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","/dispatcher-servlet.xml"})
public class UserDaoImplTest {
    @Resource
    UserDaoImpl userDaoImpl;
    
    public UserDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setSessionFactory method, of class UserDaoImpl.
     */

    /**
     * Test of saveUserInfo method, of class UserDaoImpl.
     */
    @Test
    public void testSaveUserInfo() {
        System.out.println("saveUserInfo");
        Employee user = new Employee();
        user.setEmailid("k.dileep.1990@gmail.com");
        user.setFirstname("dileep");
        user.setLastname("k");
        user.setPassword("1234567891");
        user.setRoleses(null);
        user.setSalary(10000.00);
        user.setUsertype("Full Time Employee");
        boolean expResult = true;
        boolean result = userDaoImpl.saveUserInfo(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of isAuthenticated method, of class UserDaoImpl.
     */
    @Test
    public void testIsAuthenticated() {
        System.out.println("isAuthenticated");
        Employee user = new Employee();
        user.setEmailid("mounika.msit@gmail.com");
        user.setPassword("1234567890");
        boolean expResult = true;
        boolean result = userDaoImpl.isAuthenticated(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRoles method, of class UserDaoImpl.
     */
    
    /**
     * Test of assignRoles method, of class UserDaoImpl.
     */
    @Test
    public void testAssignRoles() {
        System.out.println("assignRoles");
        String[] role = ("System Admin,User Admin").split(",");
        String emailid = "mounika.msit@gmail.com";
        boolean expResult = true;
        boolean result = userDaoImpl.assignRoles(role, emailid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAssignedRoles method, of class UserDaoImpl.
     */
//    @Test
//    public void testGetAssignedRoles() {
//        System.out.println("getAssignedRoles");
//        String firstName = "";
//        UserDaoImpl instance = new UserDaoImpl();
//        List expResult = null;
//        List result = instance.getAssignedRoles(firstName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}