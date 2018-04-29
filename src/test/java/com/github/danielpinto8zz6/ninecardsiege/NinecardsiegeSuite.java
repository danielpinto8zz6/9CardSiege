/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege;

import com.github.danielpinto8zz6.ninecardsiege.logic.LogicSuite;
import com.github.danielpinto8zz6.ninecardsiege.text_ui.Text_uiSuite;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class NinecardsiegeSuite extends TestCase {
    
    public NinecardsiegeSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("NinecardsiegeSuite");
        suite.addTest(AppTest.suite());
        suite.addTest(Text_uiSuite.suite());
        suite.addTest(LogicSuite.suite());
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
