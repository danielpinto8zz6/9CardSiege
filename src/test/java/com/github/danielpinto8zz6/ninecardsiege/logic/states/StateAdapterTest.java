/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class StateAdapterTest extends TestCase {
    
    public StateAdapterTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(StateAdapterTest.class);
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
     * Test of getGame method, of class StateAdapter.
     */
    public void testGetGame() {
        System.out.println("getGame");
        StateAdapter instance = null;
        GameData expResult = null;
        GameData result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGame method, of class StateAdapter.
     */
    public void testSetGame() {
        System.out.println("setGame");
        GameData game = null;
        StateAdapter instance = null;
        instance.setGame(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Start method, of class StateAdapter.
     */
    public void testStart() {
        System.out.println("Start");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.Start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class StateAdapter.
     */
    public void testFinish() {
        System.out.println("Finish");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.Finish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DrawTopCard method, of class StateAdapter.
     */
    public void testDrawTopCard() {
        System.out.println("DrawTopCard");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.DrawTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArchersAttack method, of class StateAdapter.
     */
    public void testArchersAttack() {
        System.out.println("ArchersAttack");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.ArchersAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BoilingWaterAttack method, of class StateAdapter.
     */
    public void testBoilingWaterAttack() {
        System.out.println("BoilingWaterAttack");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.BoilingWaterAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Attack method, of class StateAdapter.
     */
    public void testAttack() {
        System.out.println("Attack");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.Attack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CloseCombatAttack method, of class StateAdapter.
     */
    public void testCloseCombatAttack() {
        System.out.println("CloseCombatAttack");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.CloseCombatAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Capture method, of class StateAdapter.
     */
    public void testCapture() {
        System.out.println("Capture");
        StateAdapter instance = null;
        IStates expResult = null;
        IStates result = instance.Capture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
