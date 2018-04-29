/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author daniel
 */
public class EventsSuite extends TestCase {
    
    public EventsSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("EventsSuite");
        suite.addTest(CoverOfDarknessTest.suite());
        suite.addTest(FlamingArrowsTest.suite());
        suite.addTest(DeathOfLeaderTest.suite());
        suite.addTest(GateFortifiedTest.suite());
        suite.addTest(IllnessTest.suite());
        suite.addTest(EnemyFatigueTest.suite());
        suite.addTest(RallyTest.suite());
        suite.addTest(BadWeatherTest.suite());
        suite.addTest(FaithTest.suite());
        suite.addTest(CollapsedTest.suite());
        suite.addTest(SuppliesSpoiledTest.suite());
        suite.addTest(TrebuchetAttackTest.suite());
        suite.addTest(BoilingOilTest.suite());
        suite.addTest(RepairedTrebuchetTest.suite());
        suite.addTest(GuardsDistractedTest.suite());
        suite.addTest(DeterminedEnemyTest.suite());
        suite.addTest(IronShieldsTest.suite());
        suite.addTest(VolleyOfArrowsTest.suite());
        suite.addTest(EventTest.suite());
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
