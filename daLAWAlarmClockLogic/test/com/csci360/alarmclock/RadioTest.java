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
public class RadioTest {
    
    public RadioTest() {
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
     * Test of adjustVolume method, of class Radio.
     */
    @Test
    public void testAdjustVolume() {
        System.out.println("adjustVolume");
        int dir = 0;
        Radio instance = new Radio();
        instance.adjustVolume(dir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleBand method, of class Radio.
     */
    @Test
    public void testToggleBand() {
        System.out.println("toggleBand");
        Radio instance = new Radio();
        instance.toggleBand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adjustFrequency method, of class Radio.
     */
    @Test
    public void testAdjustFrequency() {
        System.out.println("adjustFrequency");
        Radio instance = new Radio();
        instance.adjustFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startRadio method, of class Radio.
     */
    @Test
    public void testStartRadio() {
        System.out.println("startRadio");
        Radio instance = new Radio();
        instance.startRadio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopRadio method, of class Radio.
     */
    @Test
    public void testStopRadio() {
        System.out.println("stopRadio");
        Radio instance = new Radio();
        instance.stopRadio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Radio.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBand method, of class Radio.
     */
    @Test
    public void testGetBand() {
        System.out.println("getBand");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getBand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Radio instance = new Radio();
        float expResult = 0.0F;
        float result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
