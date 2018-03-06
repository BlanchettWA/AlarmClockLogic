/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liam
 */
public class TimeTest {
    
    public TimeTest() {
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
     * Test of getHour method, of class Time.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Time.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHour method, of class Time.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int h = 0;
        Time instance = new Time();
        instance.setHour(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinute method, of class Time.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int m = 0;
        Time instance = new Time();
        instance.setMinute(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Time.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Time instance = new Time();
        int[] expResult = null;
        int[] result = instance.getTime();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
