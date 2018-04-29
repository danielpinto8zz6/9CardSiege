package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
/**
 *
 * @author daniel
 */
public interface IStates {

    /**
     *
     * @return
     */
    IStates Start();

    /**
     *
     * @return
     */
    IStates DrawTopCard();

    /**
     *
     * @return
     */
    IStates ArchersAttack();

    /**
     *
     * @return
     */
    IStates BoilingWaterAttack();

    /**
     *
     * @return
     */
    IStates CloseCombatAttack();

    /**
     *
     * @return
     */
    IStates Capture();

    /**
     *
     * @return
     */
    IStates Attack();

    /**
     *
     * @return
     */
    IStates Finish();
}
