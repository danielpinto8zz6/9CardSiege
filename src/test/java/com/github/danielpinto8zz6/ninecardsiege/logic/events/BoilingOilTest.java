/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class BoilingOilTest extends TestCase {
    
    public BoilingOilTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BoilingOilTest.class);
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
     * Test of apply method, of class BoilingOil.
     */
    public void testApply() {
        System.out.println("apply");
        GameData gameData = null;
        BoilingOil.apply(gameData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemiesOnCircleSpaces method, of class BoilingOil.
     */
    public void testGetEnemiesOnCircleSpaces() {
        System.out.println("getEnemiesOnCircleSpaces");
        GameData gameData = null;
        List<Enemy> expResult = null;
        List<Enemy> result = BoilingOil.getEnemiesOnCircleSpaces(gameData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
