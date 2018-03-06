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
    @Test
    public void testAlarmClock() {
        System.out.println("AlarmClock");
        AlarmClock instance = new AlarmClock();
        instance.AlarmClock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableAlarmSet method, of class AlarmClock.
     */
    @Test
    public void testEnableAlarmSet() {
        System.out.println("enableAlarmSet");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.enableAlarmSet(alm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specifyTime method, of class AlarmClock.
     */
    @Test
    public void testSpecifyTime() {
        System.out.println("specifyTime");
        int hr = 0;
        int mn = 0;
        AlarmClock instance = new AlarmClock();
        instance.specifyTime(hr, mn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specifySound method, of class AlarmClock.
     */
    @Test
    public void testSpecifySound() {
        System.out.println("specifySound");
        boolean snd = false;
        AlarmClock instance = new AlarmClock();
        instance.specifySound(snd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopAlarm method, of class AlarmClock.
     */
    @Test
    public void testStopAlarm() {
        System.out.println("stopAlarm");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.stopAlarm(alm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of snoozeAlarm method, of class AlarmClock.
     */
    @Test
    public void testSnoozeAlarm() {
        System.out.println("snoozeAlarm");
        int alm = 0;
        AlarmClock instance = new AlarmClock();
        instance.snoozeAlarm(alm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
