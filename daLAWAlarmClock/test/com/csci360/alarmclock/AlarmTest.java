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
public class AlarmTest {
    
    public AlarmTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specifyTime method, of class Alarm.
     */
    @Test
    public void testSpecifyTime() {
        System.out.println("specifyTime");
        int h = 0;
        int m = 0;
        Alarm instance = new Alarm();
        instance.specifyTime(h, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specifySound method, of class Alarm.
     */
    @Test
    public void testSpecifySound() {
        System.out.println("specifySound");
        boolean snd = false;
        Alarm instance = new Alarm();
        instance.specifySound(snd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableAlarm method, of class Alarm.
     */
    @Test
    public void testEnableAlarm() {
        System.out.println("enableAlarm");
        Alarm instance = new Alarm();
        instance.enableAlarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableAlarm method, of class Alarm.
     */
    @Test
    public void testDisableAlarm() {
        System.out.println("disableAlarm");
        Alarm instance = new Alarm();
        instance.disableAlarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTriggerTime method, of class Alarm.
     */
    @Test
    public void testGetTriggerTime() {
        System.out.println("getTriggerTime");
        Alarm instance = new Alarm();
        Time expResult = null;
        Time result = instance.getTriggerTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Alarm.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Alarm instance = new Alarm();
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
