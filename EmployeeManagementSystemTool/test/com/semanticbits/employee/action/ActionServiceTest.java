/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticbits.employee.action;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author dileep
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","/dispatcher-servlet.xml"})
public class ActionServiceTest {
    @Resource
    ActionService actionService;
    
    public ActionServiceTest() {
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
     * Test of setActionDao method, of class ActionService.

    /**
     * Test of deleteEmployee method, of class ActionService.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        String emailId = "k.dileep.1990@gmail.com";
        boolean expResult = true;
        boolean result = actionService.deleteEmployee(emailId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editEmployee method, of class ActionService.
     */
    @Test
    public void testEditEmployee() {
        System.out.println("editEmployee");
        String firstname = "mouni";
        String lastname = "s";
        String emailid = "mounika.msit@gmail.com";
        String salary = "10000";
        String odlemail = "mounika.msit@gmail.com";
        String expResult = "true";
        String result = actionService.editEmployee(firstname, lastname, emailid, salary, odlemail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}