/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.text_ui;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class TextUITest extends TestCase {
    
    public TextUITest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TextUITest.class);
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
     * Test of getUserInputWhileAwaitTopCardToBeDrawn method, of class TextUI.
     */
    public void testGetUserInputWhileAwaitTopCardToBeDrawn() {
        System.out.println("getUserInputWhileAwaitTopCardToBeDrawn");
        TextUI instance = null;
        instance.getUserInputWhileAwaitTopCardToBeDrawn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class TextUI.
     */
    public void testRun() {
        System.out.println("run");
        TextUI instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGame method, of class TextUI.
     */
    public void testGetGame() {
        System.out.println("getGame");
        TextUI instance = null;
        Game expResult = null;
        Game result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleRestoreGameFromFileOption method, of class TextUI.
     */
    public void testHandleRestoreGameFromFileOption() throws Exception {
        System.out.println("handleRestoreGameFromFileOption");
        TextUI instance = null;
        instance.handleRestoreGameFromFileOption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
