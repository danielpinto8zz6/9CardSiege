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
public class PlayerTest extends TestCase {
    
    public PlayerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PlayerTest.class);
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
     * Test of getmSabotage method, of class Player.
     */
    public void testGetmSabotage() {
        System.out.println("getmSabotage");
        Player instance = null;
        int expResult = 0;
        int result = instance.getmSabotage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmSabotage method, of class Player.
     */
    public void testSetmSabotage() {
        System.out.println("setmSabotage");
        int mSabotage = 0;
        Player instance = null;
        instance.setmSabotage(mSabotage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmRallyTroops method, of class Player.
     */
    public void testGetmRallyTroops() {
        System.out.println("getmRallyTroops");
        Player instance = null;
        int expResult = 0;
        int result = instance.getmRallyTroops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmRallyTroops method, of class Player.
     */
    public void testSetmRallyTroops() {
        System.out.println("setmRallyTroops");
        int mRallyTroops = 0;
        Player instance = null;
        instance.setmRallyTroops(mRallyTroops);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmCoupure method, of class Player.
     */
    public void testGetmCoupure() {
        System.out.println("getmCoupure");
        Player instance = null;
        int expResult = 0;
        int result = instance.getmCoupure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmCoupure method, of class Player.
     */
    public void testSetmCoupure() {
        System.out.println("setmCoupure");
        int mCoupure = 0;
        Player instance = null;
        instance.setmCoupure(mCoupure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmRaidSupplies method, of class Player.
     */
    public void testGetmRaidSupplies() {
        System.out.println("getmRaidSupplies");
        Player instance = null;
        int expResult = 0;
        int result = instance.getmRaidSupplies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmRaidSupplies method, of class Player.
     */
    public void testSetmRaidSupplies() {
        System.out.println("setmRaidSupplies");
        int mRaidSupplies = 0;
        Player instance = null;
        instance.setmRaidSupplies(mRaidSupplies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameData method, of class Player.
     */
    public void testGetGameData() {
        System.out.println("getGameData");
        Player instance = null;
        GameData expResult = null;
        GameData result = instance.getGameData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameData method, of class Player.
     */
    public void testSetGameData() {
        System.out.println("setGameData");
        GameData gameData = null;
        Player instance = null;
        instance.setGameData(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanArchersAtack method, of class Player.
     */
    public void testIsCanArchersAtack() {
        System.out.println("isCanArchersAtack");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanArchersAtack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanArchersAtack method, of class Player.
     */
    public void testSetCanArchersAtack() {
        System.out.println("setCanArchersAtack");
        boolean canArchersAtack = false;
        Player instance = null;
        instance.setCanArchersAtack(canArchersAtack);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanBoilingWater method, of class Player.
     */
    public void testIsCanBoilingWater() {
        System.out.println("isCanBoilingWater");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanBoilingWater();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanBoilingWater method, of class Player.
     */
    public void testSetCanBoilingWater() {
        System.out.println("setCanBoilingWater");
        boolean canBoilingWater = false;
        Player instance = null;
        instance.setCanBoilingWater(canBoilingWater);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanCloseCombat method, of class Player.
     */
    public void testIsCanCloseCombat() {
        System.out.println("isCanCloseCombat");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanCloseCombat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanCloseCombat method, of class Player.
     */
    public void testSetCanCloseCombat() {
        System.out.println("setCanCloseCombat");
        boolean canCloseCombat = false;
        Player instance = null;
        instance.setCanCloseCombat(canCloseCombat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanCoupure method, of class Player.
     */
    public void testIsCanCoupure() {
        System.out.println("isCanCoupure");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanCoupure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanCoupure method, of class Player.
     */
    public void testSetCanCoupure() {
        System.out.println("setCanCoupure");
        boolean canCoupure = false;
        Player instance = null;
        instance.setCanCoupure(canCoupure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanSupplyRaid method, of class Player.
     */
    public void testIsCanSupplyRaid() {
        System.out.println("isCanSupplyRaid");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanSupplyRaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanSupplyRaid method, of class Player.
     */
    public void testSetCanSupplyRaid() {
        System.out.println("setCanSupplyRaid");
        boolean canSupplyRaid = false;
        Player instance = null;
        instance.setCanSupplyRaid(canSupplyRaid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanSabotage method, of class Player.
     */
    public void testIsCanSabotage() {
        System.out.println("isCanSabotage");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanSabotage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanSabotage method, of class Player.
     */
    public void testSetCanSabotage() {
        System.out.println("setCanSabotage");
        boolean canSabotage = false;
        Player instance = null;
        instance.setCanSabotage(canSabotage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanExtraAP method, of class Player.
     */
    public void testIsCanExtraAP() {
        System.out.println("isCanExtraAP");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanExtraAP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanExtraAP method, of class Player.
     */
    public void testSetCanExtraAP() {
        System.out.println("setCanExtraAP");
        boolean canExtraAP = false;
        Player instance = null;
        instance.setCanExtraAP(canExtraAP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanRallyTroops method, of class Player.
     */
    public void testIsCanRallyTroops() {
        System.out.println("isCanRallyTroops");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanRallyTroops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanRallyTroops method, of class Player.
     */
    public void testSetCanRallyTroops() {
        System.out.println("setCanRallyTroops");
        boolean canRallyTroops = false;
        Player instance = null;
        instance.setCanRallyTroops(canRallyTroops);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCanTunnelMovement method, of class Player.
     */
    public void testIsCanTunnelMovement() {
        System.out.println("isCanTunnelMovement");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isCanTunnelMovement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanTunnelMovement method, of class Player.
     */
    public void testSetCanTunnelMovement() {
        System.out.println("setCanTunnelMovement");
        boolean canTunnelMovement = false;
        Player instance = null;
        instance.setCanTunnelMovement(canTunnelMovement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActionPoints method, of class Player.
     */
    public void testGetActionPoints() {
        System.out.println("getActionPoints");
        Player instance = null;
        int expResult = 0;
        int result = instance.getActionPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActionPoints method, of class Player.
     */
    public void testSetActionPoints() {
        System.out.println("setActionPoints");
        int actionPoints = 0;
        Player instance = null;
        instance.setActionPoints(actionPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoral method, of class Player.
     */
    public void testGetMoral() {
        System.out.println("getMoral");
        Player instance = null;
        int expResult = 0;
        int result = instance.getMoral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoral method, of class Player.
     */
    public void testSetMoral() {
        System.out.println("setMoral");
        int moral = 0;
        Player instance = null;
        instance.setMoral(moral);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWallStrength method, of class Player.
     */
    public void testGetWallStrength() {
        System.out.println("getWallStrength");
        Player instance = null;
        int expResult = 0;
        int result = instance.getWallStrength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWallStrength method, of class Player.
     */
    public void testSetWallStrength() {
        System.out.println("setWallStrength");
        int wallStrength = 0;
        Player instance = null;
        instance.setWallStrength(wallStrength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplies method, of class Player.
     */
    public void testGetSupplies() {
        System.out.println("getSupplies");
        Player instance = null;
        int expResult = 0;
        int result = instance.getSupplies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplies method, of class Player.
     */
    public void testSetSupplies() {
        System.out.println("setSupplies");
        int supplies = 0;
        Player instance = null;
        instance.setSupplies(supplies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetModifiers method, of class Player.
     */
    public void testResetModifiers() {
        System.out.println("resetModifiers");
        Player instance = null;
        instance.resetModifiers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
