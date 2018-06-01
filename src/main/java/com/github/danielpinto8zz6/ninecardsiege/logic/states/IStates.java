package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA;

/*
 * List of expected events when taking into account all the states.
 */
/**
 * IStates interface.
 *
 * @author daniel
 * @version $Id: $Id
 */
public interface IStates {

  /**
   * start. starts the game
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates start();

  /**
   * drawTopCard. draws the card on the top of the deck
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates drawTopCard();

  IStates StartOfTheTurn();

  /**
   * archersAttack. performs archers attack
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates archersAttack();

  /**
   * boilingWaterAttack. performs boiling water attack
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates boilingWaterAttack();

  /**
   * closeCombatAttack. performs close combat attack
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates closeCombatAttack();

  /**
   * capture. performs capture
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates capture();

  /**
   * attack. performs attack
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   * @param name a {@link java.lang.String} object.
   */
  IStates attack(String name);

  /**
   * finish. finishes the game
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates finish();

  /**
   * endOfTurn. performs the end of the turn
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates endOfTurn();

  /**
   * extraActionPoint. checks if is possible to add extra action point
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates extraActionPoint();

  /**
   * applyExtraActionPoint. adds extra action point whit the type received by parameter
   *
   * @param extra a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA} object.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates applyExtraActionPoint(EXTRA extra);

  /**
   * coupure. performs coupure
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates coupure();

  /**
   * rallyTroops. performs rally troops
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates rallyTroops();

  /**
   * tunnelMovement. performs tunnel movement
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates tunnelMovement();

  /**
   * supplyRaid.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates supplyRaid();

  /**
   * sabotage. performs sabotage
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates sabotage();

  /**
   * checkStatus. check the current status
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates checkStatus();

  /**
   * applyRallyTroops. applies rally troops
   *
   * @param plusOne a boolean.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates applyRallyTroops(boolean plusOne);

  /**
   * playAgain.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates playAgain();
}
