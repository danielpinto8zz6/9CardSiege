/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.CardsSuite;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.EventsSuite;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.StatesSuite;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class LogicSuite extends TestCase {
    
    public LogicSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("LogicSuite");
        suite.addTest(StatesSuite.suite());
        suite.addTest(BattleCardTest.suite());
        suite.addTest(PlayerTest.suite());
        suite.addTest(GameSaveTest.suite());
        suite.addTest(ConstantsTest.suite());
        suite.addTest(StatusCardTest.suite());
        suite.addTest(DiceTest.suite());
        suite.addTest(GameTest.suite());
        suite.addTest(CardsSuite.suite());
        suite.addTest(EnemyTest.suite());
        suite.addTest(GameDataTest.suite());
        suite.addTest(EventsSuite.suite());
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
