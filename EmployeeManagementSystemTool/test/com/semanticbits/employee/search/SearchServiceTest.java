/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticbits.employee.search;

import com.semanticbits.employee.Employee;
import javax.annotation.Resource;
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
public class SearchServiceTest {

    @Resource
    private SearchService searchService;

    public SearchService getSearchService() {
        return searchService;
    }

    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }

    public SearchServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAutoSuggestions method, of class SearchService.
     */
//    @Test
//    public void testGetAutoSuggestions() {
//        System.out.println("getAutoSuggestions");
//        SearchService instance = new SearchService();
//        AutoSuggestions expResult = null;
//        AutoSuggestions result = instance.getAutoSuggestions();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of retrieveAutoSuggestions method, of class SearchService.
     */
//    @Test
//    public void testRetrieveAutoSuggestions() {
//        System.out.println("retrieveAutoSuggestions");
//        SearchService instance = new SearchService();
//        instance.retrieveAutoSuggestions();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of retrieveEmployeeDetails method, of class SearchService.
     */
    @Before
    public void testRetrieveEmployeeDetails() {
        System.out.println("retrieveEmployeeDetails");
        String firstName = "mounika";
        String lastName = "s";
        String role = "";
        String userType = "Full Time Employee";
        searchService.retrieveEmployeeDetails(firstName, lastName, role, userType);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of getEmployees method, of class SearchService.
     */
    @Test
    public void testGetEmployees() {
        System.out.println("getEmployees");
        String expResult = "mounika.msit@gmail.com";
        Employee[] result = searchService.getEmployees();
        System.out.println(result[0].getEmailid());
        assertEquals(expResult, result[0].getEmailid());
    }
}