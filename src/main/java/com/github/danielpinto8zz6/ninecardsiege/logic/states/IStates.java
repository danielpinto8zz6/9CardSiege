package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
/**
 * <p>IStates interface.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public interface IStates {

    /**
     * <p>Start.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates Start();

    /**
     * <p>DrawTopCard.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates DrawTopCard();

    /**
     * <p>ArchersAttack.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates ArchersAttack();

    /**
     * <p>BoilingWaterAttack.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates BoilingWaterAttack();

    /**
     * <p>CloseCombatAttack.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates CloseCombatAttack();

    /**
     * <p>Capture.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates Capture();

    /**
     * <p>Attack.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates Attack();

    /**
     * <p>Finish.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
     */
    IStates Finish();
}
