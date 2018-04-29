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
public class CardsSuite extends TestCase {
    
    public CardsSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("CardsSuite");
        suite.addTest(Card6Test.suite());
        suite.addTest(Card1Test.suite());
        suite.addTest(CardTest.suite());
        suite.addTest(Card3Test.suite());
        suite.addTest(Card7Test.suite());
        suite.addTest(Card2Test.suite());
        suite.addTest(Card5Test.suite());
        suite.addTest(Card4Test.suite());
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
