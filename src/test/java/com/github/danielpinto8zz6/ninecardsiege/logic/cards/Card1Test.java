/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class Card1Test extends TestCase {
    
    public Card1Test(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Card1Test.class);
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
     * Test of Day1Event method, of class Card1.
     */
    public void testDay1Event() {
        System.out.println("Day1Event");
        Card1 instance = null;
        instance.Day1Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Day2Event method, of class Card1.
     */
    public void testDay2Event() {
        System.out.println("Day2Event");
        Card1 instance = null;
        instance.Day2Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Day3Event method, of class Card1.
     */
    public void testDay3Event() {
        System.out.println("Day3Event");
        Card1 instance = null;
        instance.Day3Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay1 method, of class Card1.
     */
    public void testMoveEnemyDay1() {
        System.out.println("moveEnemyDay1");
        Card1 instance = null;
        instance.moveEnemyDay1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay2 method, of class Card1.
     */
    public void testMoveEnemyDay2() {
        System.out.println("moveEnemyDay2");
        Card1 instance = null;
        instance.moveEnemyDay2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay3 method, of class Card1.
     */
    public void testMoveEnemyDay3() {
        System.out.println("moveEnemyDay3");
        Card1 instance = null;
        instance.moveEnemyDay3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card1.
     */
    public void testToString() {
        System.out.println("toString");
        Card1 instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
