/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class EnemyTest extends TestCase {
    
    public EnemyTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EnemyTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getName method, of class Enemy.
     */
    public void testGetName() {
        System.out.println("getName");
        Enemy instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Enemy.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Enemy instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrength method, of class Enemy.
     */
    public void testGetStrength() {
        System.out.println("getStrength");
        Enemy instance = null;
        int expResult = 0;
        int result = instance.getStrength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrength method, of class Enemy.
     */
    public void testSetStrength() {
        System.out.println("setStrength");
        int strength = 0;
        Enemy instance = null;
        instance.setStrength(strength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Enemy.
     */
    public void testGetPosition() {
        System.out.println("getPosition");
        Enemy instance = null;
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Enemy.
     */
    public void testSetPosition() {
        System.out.println("setPosition");
        int position = 0;
        Enemy instance = null;
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Enemy.
     */
    public void testMove() {
        System.out.println("move");
        Constants.MOVE move = null;
        Enemy instance = null;
        instance.move(move);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Enemy.
     */
    public void testToString() {
        System.out.println("toString");
        Enemy instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
