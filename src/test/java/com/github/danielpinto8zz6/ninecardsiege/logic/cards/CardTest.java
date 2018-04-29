/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class CardTest extends TestCase {
    
    public CardTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CardTest.class);
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
     * Test of getCardNumber method, of class Card.
     */
    public void testGetCardNumber() {
        System.out.println("getCardNumber");
        Card instance = null;
        int expResult = 0;
        int result = instance.getCardNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameData method, of class Card.
     */
    public void testGetGameData() {
        System.out.println("getGameData");
        Card instance = null;
        GameData expResult = null;
        GameData result = instance.getGameData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameData method, of class Card.
     */
    public void testSetGameData() {
        System.out.println("setGameData");
        GameData gameData = null;
        Card instance = null;
        instance.setGameData(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class Card.
     */
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Card instance = null;
        Player expResult = null;
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Day1Event method, of class Card.
     */
    public void testDay1Event() {
        System.out.println("Day1Event");
        Card instance = null;
        instance.Day1Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Day2Event method, of class Card.
     */
    public void testDay2Event() {
        System.out.println("Day2Event");
        Card instance = null;
        instance.Day2Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Day3Event method, of class Card.
     */
    public void testDay3Event() {
        System.out.println("Day3Event");
        Card instance = null;
        instance.Day3Event();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay1 method, of class Card.
     */
    public void testMoveEnemyDay1() {
        System.out.println("moveEnemyDay1");
        Card instance = null;
        instance.moveEnemyDay1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay2 method, of class Card.
     */
    public void testMoveEnemyDay2() {
        System.out.println("moveEnemyDay2");
        Card instance = null;
        instance.moveEnemyDay2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEnemyDay3 method, of class Card.
     */
    public void testMoveEnemyDay3() {
        System.out.println("moveEnemyDay3");
        Card instance = null;
        instance.moveEnemyDay3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CardImpl extends Card {

        public CardImpl() {
            super(null);
        }

        public void Day1Event() {
        }

        public void Day2Event() {
        }

        public void Day3Event() {
        }

        public void moveEnemyDay1() {
        }

        public void moveEnemyDay2() {
        }

        public void moveEnemyDay3() {
        }
    }
    
}
