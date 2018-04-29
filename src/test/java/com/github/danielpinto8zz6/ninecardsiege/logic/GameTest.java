/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class GameTest extends TestCase {
    
    public GameTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameTest.class);
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
     * Test of getState method, of class Game.
     */
    public void testGetState() {
        System.out.println("getState");
        Game instance = new Game();
        IStates expResult = null;
        IStates result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Game.
     */
    public void testSetState() {
        System.out.println("setState");
        IStates state = null;
        Game instance = new Game();
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameData method, of class Game.
     */
    public void testGetGameData() {
        System.out.println("getGameData");
        Game instance = new Game();
        GameData expResult = null;
        GameData result = instance.getGameData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameData method, of class Game.
     */
    public void testSetGameData() {
        System.out.println("setGameData");
        GameData gameData = null;
        Game instance = new Game();
        instance.setGameData(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsgLog method, of class Game.
     */
    public void testGetMsgLog() {
        System.out.println("getMsgLog");
        Game instance = new Game();
        List<String> expResult = null;
        List<String> result = instance.getMsgLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearMsgLog method, of class Game.
     */
    public void testClearMsgLog() {
        System.out.println("clearMsgLog");
        Game instance = new Game();
        instance.clearMsgLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Game.
     */
    public void testToString() {
        System.out.println("toString");
        Game instance = new Game();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Start method, of class Game.
     */
    public void testStart() {
        System.out.println("Start");
        Game instance = new Game();
        instance.Start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Finish method, of class Game.
     */
    public void testFinish() {
        System.out.println("Finish");
        Game instance = new Game();
        instance.Finish();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DrawTopCard method, of class Game.
     */
    public void testDrawTopCard() {
        System.out.println("DrawTopCard");
        Game instance = new Game();
        instance.DrawTopCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
