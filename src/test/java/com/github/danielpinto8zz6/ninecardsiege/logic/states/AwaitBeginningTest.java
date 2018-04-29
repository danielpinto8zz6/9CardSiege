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
public class AwaitBeginningTest extends TestCase {
    
    public AwaitBeginningTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AwaitBeginningTest.class);
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
     * Test of Start method, of class AwaitBeginning.
     */
    public void testStart() {
        System.out.println("Start");
        AwaitBeginning instance = null;
        IStates expResult = null;
        IStates result = instance.Start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class AwaitBeginning.
     */
    public void testFinish() {
        System.out.println("Finish");
        AwaitBeginning instance = null;
        IStates expResult = null;
        IStates result = instance.Finish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
