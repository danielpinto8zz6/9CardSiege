package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
public interface IStates {

    /**
     * Start the game
     */
    IStates Start();

    /**
     * Resolve event text Advance enemies Perform close combat action if 2
     * enemies in close combat area
     */
    IStates DrawTopCard();

    /**
     * Boiling water attack And action points > 0 AND unused in current turn
     */
    IStates ArchersAttack();

    /**
     * Archers attack And action points > 0
     */
    IStates BoilingWaterAttack();

    IStates CloseCombatAttack();

    IStates Capture();

    IStates Attack();

    IStates Finish();
}
