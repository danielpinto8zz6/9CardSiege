package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
/**
 * <p>
 * IStates interface.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public interface IStates {

    /**
     * <p>
     * start.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates start();

    /**
     * <p>
     * drawTopCard.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates drawTopCard();

    /**
     * <p>
     * archersAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates archersAttack();

    /**
     * <p>
     * boilingWaterAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates boilingWaterAttack();

    /**
     * <p>
     * closeCombatAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates closeCombatAttack();

    /**
     * <p>
     * capture.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates capture();

    /**
     * <p>
     * attack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates attack();

    /**
     * <p>
     * finish.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    IStates finish();
}
