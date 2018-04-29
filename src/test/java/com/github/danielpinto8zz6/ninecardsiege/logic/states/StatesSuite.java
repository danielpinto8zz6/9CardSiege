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
public class StatesSuite extends TestCase {
    
    public StatesSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("StatesSuite");
        suite.addTest(AwaitBeginningTest.suite());
        suite.addTest(AwaitTopCardToBeDrawnTest.suite());
        suite.addTest(AwaitActionSelectionTest.suite());
        suite.addTest(AwaitEnemyTrackSelectionForArchersAttackTest.suite());
        suite.addTest(StateAdapterTest.suite());
        suite.addTest(AwaitEnemyTrackSelectionForBoilingWaterAttackTest.suite());
        suite.addTest(GameOverTest.suite());
        suite.addTest(IStatesTest.suite());
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
    
}
