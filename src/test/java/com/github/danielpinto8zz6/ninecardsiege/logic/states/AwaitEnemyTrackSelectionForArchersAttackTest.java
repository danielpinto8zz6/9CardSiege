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
public class AwaitEnemyTrackSelectionForArchersAttackTest extends TestCase {
    
    public AwaitEnemyTrackSelectionForArchersAttackTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AwaitEnemyTrackSelectionForArchersAttackTest.class);
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
     * Test of Attack method, of class AwaitEnemyTrackSelectionForArchersAttack.
     */
    public void testAttack() {
        System.out.println("Attack");
        AwaitEnemyTrackSelectionForArchersAttack instance = null;
        IStates expResult = null;
        IStates result = instance.Attack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class AwaitEnemyTrackSelectionForArchersAttack.
     */
    public void testFinish() {
        System.out.println("Finish");
        AwaitEnemyTrackSelectionForArchersAttack instance = null;
        IStates expResult = null;
        IStates result = instance.Finish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
