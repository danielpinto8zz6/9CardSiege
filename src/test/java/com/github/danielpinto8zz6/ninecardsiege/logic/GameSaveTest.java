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
public class GameSaveTest extends TestCase {
    
    public GameSaveTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameSaveTest.class);
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
     * Test of saveGameToFile method, of class GameSave.
     */
    public void testSaveGameToFile() throws Exception {
        System.out.println("saveGameToFile");
        Game game = null;
        String fileName = "";
        GameSave.saveGameToFile(game, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveGameFromFile method, of class GameSave.
     */
    public void testRetrieveGameFromFile() throws Exception {
        System.out.println("retrieveGameFromFile");
        String fileName = "";
        Object expResult = null;
        Object result = GameSave.retrieveGameFromFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
