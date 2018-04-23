package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
public interface IStates {

    /// forma primitiva tenho quer  ainda  melhor isto////
    //waitBeginning
    IStates startGame();
    //waitCardPlay
    IStates pickAnEventCard();
    IStates doEvent();
    //waitEnemyMoves
    IStates moveEnemies();
    //waitPlayerAtions
    IStates checkPlayerAtion();
    IStates playerAtion();
    //waitEndOfDay
    IStates endOfTheDay();
    IStates endChek();

    IStates quit();
}
