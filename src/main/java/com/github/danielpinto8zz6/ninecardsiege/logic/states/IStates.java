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
   * start.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates start();

  /**
   * drawTopCard.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates drawTopCard();

  /**
   * archersAttack.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates archersAttack();

  /**
   * boilingWaterAttack.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates boilingWaterAttack();

  /**
   * closeCombatAttack.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates closeCombatAttack();

  /**
   * capture.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates capture();

  /**
   * attack.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   * @param name a {@link java.lang.String} object.
   */
  IStates attack(String name);

  /**
   * finish.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates finish();

  /**
   * endOfTurn.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates endOfTurn();

  /**
   * extraActionPoint.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates extraActionPoint();

  /**
   * applyExtraActionPoint.
   *
   * @param extra a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA} object.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates applyExtraActionPoint(EXTRA extra);

  /**
   * coupure.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates coupure();

  /**
   * rallyTroops.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates rallyTroops();

  /**
   * tunnelMovement.
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
   * sabotage.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates sabotage();

  /**
   * applyRallyTroops.
   *
   * @param plusOne a boolean.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates applyRallyTroops(boolean plusOne);
}
