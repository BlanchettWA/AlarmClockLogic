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
public class AlarmClockTest {
    
    public AlarmClockTest() {
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
     * Test of AlarmClock method, of class AlarmClock.
     */
//    @Test
//    public void testAlarmClock() {
//        System.out.println("AlarmClock");
//        AlarmClock instance = new AlarmClock();
//        instance.AlarmClock();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of enableAlarmSet method, of class AlarmClock.
     */
    //NOT IN ALARMCLOCK
//    @Test
//    public void testEnableAlarmSet() {
//        System.out.println("enableAlarmSet");
//        int alm = 0;
//        AlarmClock instance = new AlarmClock();
//        instance.enableAlarmSet(alm);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    //THIS ENDED UP BEING IN THE Alarm class not AlarmClock
    /**
     * Test of specifyTime method, of class AlarmClock.
     */
//    @Test
//    public void testSpecifyTime() {
//        System.out.println("specifyTime");
//        int hr = 0;
//        int mn = 0;
//        AlarmClock instance = new AlarmClock();
//        instance.specifyTime(hr, mn);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of specifySound method, of class AlarmClock.
     */
    //THIS ENDED UP BEING IN THE Alarm class not AlarmClock
//    @Test
//    public void testSpecifySound() {
//        System.out.println("specifySound");
//        boolean snd = false;
//        AlarmClock instance = new AlarmClock();
//        instance.specifySound(snd);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of stopAlarm method, of class AlarmClock.
     */
    @Test
    public void testStopAlarm() {
        System.out.println("stopAlarm");
        //int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.stopAlarm();
        assertEquals(false, instance.checkIfAlarming());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of snoozeAlarm method, of class AlarmClock.
     */
    @Test
    public void testSnoozeAlarm() {
        System.out.println("snoozeAlarm");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        //instance.snoozeAlarm(alm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm method, of class AlarmClock.
     */
    @Test
    public void testSetAlarm() {
        System.out.println("setAlarm");
        int alm = 0;
        int hr = 0;
        int mn = 0;
        boolean snd = false;
        AlarmClock instance = new AlarmClock();
        instance.setAlarm(alm, hr, mn, snd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClock method, of class AlarmClock.
     */
    @Test
    public void testSetClock() {
        System.out.println("setClock");
        int h = 1;
        int m = 30;
        Time newTime = new Time(1,30);
        AlarmClock instance = new AlarmClock();
        instance.setClock(h, m);
        //Need a get ClockTime to check this
        //assertEquals(instance.compareTime(instance.getCurrentTime(), newTime), true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTime method, of class AlarmClock.
     */
    @Test
    public void testGetCurrentTime() {
        System.out.println("getCurrentTime");
        AlarmClock instance = new AlarmClock();
        String expResult = "";
        String result = instance.getCurrentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfAlarming method, of class AlarmClock.
     */
    @Test
    public void testCheckIfAlarming() {
        System.out.println("checkIfAlarming");
        AlarmClock instance = new AlarmClock();
        boolean expResult = false;
        boolean result = instance.checkIfAlarming();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarmInfo method, of class AlarmClock.
     */
    @Test
    public void testGetAlarmInfo() {
        System.out.println("getAlarmInfo");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        String expResult = "";
        String result = instance.getAlarmInfo(alm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of formatTime method, of class AlarmClock.
     */
    @Test
    public void testFormatTime() {
        System.out.println("formatTime");
        Time t = null;
        AlarmClock instance = new AlarmClock();
        String expResult = "";
        String result = instance.formatTime(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of enableAlarm method, of class AlarmClock.
     */
    @Test
    public void testEnableAlarm() {
        System.out.println("enableAlarm");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.enableAlarm(alm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableAlarm method, of class AlarmClock.
     */
    @Test
    public void testDisableAlarm() {
        System.out.println("disableAlarm");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.disableAlarm(alm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
