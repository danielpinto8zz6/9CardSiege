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
public class IStatesTest extends TestCase {
    
    public IStatesTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(IStatesTest.class);
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
     * Test of Start method, of class IStates.
     */
    public void testStart() {
        System.out.println("Start");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.Start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DrawTopCard method, of class IStates.
     */
    public void testDrawTopCard() {
        System.out.println("DrawTopCard");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.DrawTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArchersAttack method, of class IStates.
     */
    public void testArchersAttack() {
        System.out.println("ArchersAttack");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.ArchersAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BoilingWaterAttack method, of class IStates.
     */
    public void testBoilingWaterAttack() {
        System.out.println("BoilingWaterAttack");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.BoilingWaterAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CloseCombatAttack method, of class IStates.
     */
    public void testCloseCombatAttack() {
        System.out.println("CloseCombatAttack");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.CloseCombatAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Capture method, of class IStates.
     */
    public void testCapture() {
        System.out.println("Capture");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.Capture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Attack method, of class IStates.
     */
    public void testAttack() {
        System.out.println("Attack");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.Attack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class IStates.
     */
    public void testFinish() {
        System.out.println("Finish");
        IStates instance = new IStatesImpl();
        IStates expResult = null;
        IStates result = instance.Finish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IStatesImpl implements IStates {

        public IStates Start() {
            return null;
        }

        public IStates DrawTopCard() {
            return null;
        }

        public IStates ArchersAttack() {
            return null;
        }

        public IStates BoilingWaterAttack() {
            return null;
        }

        public IStates CloseCombatAttack() {
            return null;
        }

        public IStates Capture() {
            return null;
        }

        public IStates Attack() {
            return null;
        }

        public IStates Finish() {
            return null;
        }
    }
    
}
