package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
public interface IStates {

    /**
     * Start the game
     */
    IStates start();

    /**
     * Resolve event text Advance enemies Perform close combat action if 2
     * enemies in close combat area
     */
    IStates DrawTopCard();

    IStates quit();
}
