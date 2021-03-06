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

//    @Test
//    public void testSomeMethod() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

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
        //fail("The test case is a prototype.");
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
        //I don't think we can test this
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of enableAlarm method, of class Alarm.
     */
    @Test
    public void testEnableAlarm() {
        System.out.println("enableAlarm");
        Alarm instance = new Alarm();
        instance.enableAlarm();
        assertEquals(instance.getStatus(),true );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of disableAlarm method, of class Alarm.
     */
    @Test
    public void testDisableAlarm() {
        System.out.println("disableAlarm");
        Alarm instance = new Alarm();
        instance.disableAlarm();
        assertEquals(instance.getStatus(),false );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTriggerTime method, of class Alarm.
     */
    @Test
    public void testGetTriggerTime() {
        System.out.println("getTriggerTime");
        Alarm instance = new Alarm();
        //getTriggerTime on Alarm class returns a Time object
        //have to call getTime on Time objects to compare them here; I Think 
        //-AJ
        int[] expResult = new Time(5, 23).getTime();
        int[] result = instance.getTriggerTime().getTime();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSoundType method, of class Alarm.
     */
    @Test
    public void testGetSoundType() {
        System.out.println("getSoundType");
        Alarm instance = new Alarm();
        boolean expResult = false;
        boolean result = instance.getSoundType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of snooze method, of class Alarm.
     */
    @Test
    public void testSnooze() {
        System.out.println("snooze");
        Alarm instance = new Alarm();
        instance.snooze();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
