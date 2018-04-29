/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class GameDataTest extends TestCase {
    
    public GameDataTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameDataTest.class);
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
     * Test of getDay method, of class GameData.
     */
    public void testGetDay() {
        System.out.println("getDay");
        GameData instance = new GameData();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class GameData.
     */
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        GameData instance = new GameData();
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleCard method, of class GameData.
     */
    public void testGetBattleCard() {
        System.out.println("getBattleCard");
        GameData instance = new GameData();
        BattleCard expResult = null;
        BattleCard result = instance.getBattleCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusCard method, of class GameData.
     */
    public void testGetStatusCard() {
        System.out.println("getStatusCard");
        GameData instance = new GameData();
        StatusCard expResult = null;
        StatusCard result = instance.getStatusCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemy method, of class GameData.
     */
    public void testGetEnemy() {
        System.out.println("getEnemy");
        String name = "";
        GameData instance = new GameData();
        Enemy expResult = null;
        Enemy result = instance.getEnemy(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemies method, of class GameData.
     */
    public void testGetEnemies() {
        System.out.println("getEnemies");
        GameData instance = new GameData();
        List<Enemy> expResult = null;
        List<Enemy> result = instance.getEnemies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearMsgLog method, of class GameData.
     */
    public void testClearMsgLog() {
        System.out.println("clearMsgLog");
        GameData instance = new GameData();
        instance.clearMsgLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMsgLog method, of class GameData.
     */
    public void testAddMsgLog() {
        System.out.println("addMsgLog");
        String msg = "";
        GameData instance = new GameData();
        instance.addMsgLog(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsgLog method, of class GameData.
     */
    public void testGetMsgLog() {
        System.out.println("getMsgLog");
        GameData instance = new GameData();
        List<String> expResult = null;
        List<String> result = instance.getMsgLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GameData.
     */
    public void testToString() {
        System.out.println("toString");
        GameData instance = new GameData();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class GameData.
     */
    public void testGetPlayer() {
        System.out.println("getPlayer");
        GameData instance = new GameData();
        Player expResult = null;
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class GameData.
     */
    public void testGetCards() {
        System.out.println("getCards");
        GameData instance = new GameData();
        List<Card> expResult = null;
        List<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCards method, of class GameData.
     */
    public void testSetCards() {
        System.out.println("setCards");
        List<Card> cards = null;
        GameData instance = new GameData();
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
