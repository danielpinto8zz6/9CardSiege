package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
public interface IStates {

    IStates startGame();
    
    IStates pickAnEventCard();
    IStates doEvent();
    IStates moveEnemies();
    IStates checkPlayerAtion();
    IStates playerAtion();
    IStates endOfTheDay();
    IStates endChek();

    IStates quit();
}
