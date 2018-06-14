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
	 * applyExtraActionPoint. adds extra action point whit the type received by
	 * parameter
	 *
	 * @param extra
	 *            a
	 *            {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA}
	 *            object.
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates applyExtraActionPoint(EXTRA extra);

	/**
	 * applyRallyTroops. applies rally troops
	 *
	 * @param plusOne
	 *            a boolean.
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates applyRallyTroops(boolean plusOne);

	/**
	 * archersAttack. performs archers attack
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates archersAttack();

	/**
	 * attack. performs attack
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	IStates attack(String name);

	/**
	 * boilingWaterAttack. performs boiling water attack
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates boilingWaterAttack();

	/**
	 * capture. performs capture
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates capture();

	/**
	 * checkStatus. check the current status
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates checkStatus();

	/**
	 * closeCombatAttack. performs close combat attack
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates closeCombatAttack();

	/**
	 * coupure. performs coupure
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates coupure();

	IStates dont();

	/**
	 * drawTopCard. draws the card on the top of the deck
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates drawTopCard();

	/**
	 * endOfTurn. performs the end of the turn
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates endOfTurn();

	/**
	 * extraActionPoint. checks if is possible to add extra action point
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates extraActionPoint();

	IStates fastMovement(boolean up);

	/**
	 * finish. finishes the game
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates finish();

	IStates freeMovement(boolean up);

	IStates leaveLocation();

	/**
	 * playAgain.
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates playAgain();

	/**
	 * rallyTroops. performs rally troops
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates rallyTroops();

	/**
	 * sabotage. performs sabotage
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates sabotage();

	/**
	 * start. starts the game
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates start();

	IStates StartOfTheTurn();

	/**
	 * supplyRaid.
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates supplyRaid();

	/**
	 * tunnelMovement. performs tunnel movement
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	IStates tunnelMovement();
}
