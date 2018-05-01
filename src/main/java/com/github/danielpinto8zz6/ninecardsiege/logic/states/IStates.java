package com.github.danielpinto8zz6.ninecardsiege.logic.states;

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
   */
  IStates attack();

  /**
   * finish.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates} object.
   */
  IStates finish();
}
