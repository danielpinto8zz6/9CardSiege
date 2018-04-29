/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class BattleCardTest extends TestCase {
    
    public BattleCardTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BattleCardTest.class);
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
     * Test of getGameData method, of class BattleCard.
     */
    public void testGetGameData() {
        System.out.println("getGameData");
        BattleCard instance = null;
        GameData expResult = null;
        GameData result = instance.getGameData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameData method, of class BattleCard.
     */
    public void testSetGameData() {
        System.out.println("setGameData");
        GameData gameData = null;
        BattleCard instance = null;
        instance.setGameData(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemies method, of class BattleCard.
     */
    public void testGetEnemies() {
        System.out.println("getEnemies");
        BattleCard instance = null;
        List<Enemy> expResult = null;
        List<Enemy> result = instance.getEnemies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrebuchet method, of class BattleCard.
     */
    public void testGetTrebuchet() {
        System.out.println("getTrebuchet");
        BattleCard instance = null;
        int expResult = 0;
        int result = instance.getTrebuchet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrebuchet method, of class BattleCard.
     */
    public void testSetTrebuchet() {
        System.out.println("setTrebuchet");
        int trebuchet = 0;
        BattleCard instance = null;
        instance.setTrebuchet(trebuchet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemy method, of class BattleCard.
     */
    public void testGetEnemy() {
        System.out.println("getEnemy");
        String name = "";
        BattleCard instance = null;
        Enemy expResult = null;
        Enemy result = instance.getEnemy(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCloseCombat method, of class BattleCard.
     */
    public void testCheckCloseCombat() {
        System.out.println("checkCloseCombat");
        BattleCard instance = null;
        instance.checkCloseCombat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
