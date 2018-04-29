/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class StatusCardTest extends TestCase {
    
    public StatusCardTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(StatusCardTest.class);
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
     * Test of getGameData method, of class StatusCard.
     */
    public void testGetGameData() {
        System.out.println("getGameData");
        StatusCard instance = null;
        GameData expResult = null;
        GameData result = instance.getGameData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameData method, of class StatusCard.
     */
    public void testSetGameData() {
        System.out.println("setGameData");
        GameData gameData = null;
        StatusCard instance = null;
        instance.setGameData(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTroopPosition method, of class StatusCard.
     */
    public void testGetTroopPosition() {
        System.out.println("getTroopPosition");
        StatusCard instance = null;
        int expResult = 0;
        int result = instance.getTroopPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTroopPosition method, of class StatusCard.
     */
    public void testSetTroopPosition() {
        System.out.println("setTroopPosition");
        int troopPosition = 0;
        StatusCard instance = null;
        instance.setTroopPosition(troopPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplies method, of class StatusCard.
     */
    public void testGetSupplies() {
        System.out.println("getSupplies");
        StatusCard instance = null;
        int expResult = 0;
        int result = instance.getSupplies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSupplies method, of class StatusCard.
     */
    public void testAddSupplies() {
        System.out.println("addSupplies");
        int supplies = 0;
        StatusCard instance = null;
        instance.addSupplies(supplies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCapture method, of class StatusCard.
     */
    public void testCheckCapture() {
        System.out.println("checkCapture");
        StatusCard instance = null;
        instance.checkCapture();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSupplies method, of class StatusCard.
     */
    public void testRemoveSupplies() {
        System.out.println("removeSupplies");
        StatusCard instance = null;
        instance.removeSupplies();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
