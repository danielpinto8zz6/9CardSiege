/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class AwaitActionSelectionTest extends TestCase {
    
    public AwaitActionSelectionTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AwaitActionSelectionTest.class);
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
     * Test of ArchersAttack method, of class AwaitActionSelection.
     */
    public void testArchersAttack() {
        System.out.println("ArchersAttack");
        AwaitActionSelection instance = null;
        IStates expResult = null;
        IStates result = instance.ArchersAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BoilingWaterAttack method, of class AwaitActionSelection.
     */
    public void testBoilingWaterAttack() {
        System.out.println("BoilingWaterAttack");
        AwaitActionSelection instance = null;
        IStates expResult = null;
        IStates result = instance.BoilingWaterAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CloseCombatAttack method, of class AwaitActionSelection.
     */
    public void testCloseCombatAttack() {
        System.out.println("CloseCombatAttack");
        AwaitActionSelection instance = null;
        IStates expResult = null;
        IStates result = instance.CloseCombatAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class AwaitActionSelection.
     */
    public void testFinish() {
        System.out.println("Finish");
        AwaitActionSelection instance = null;
        IStates expResult = null;
        IStates result = instance.Finish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
