package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * StateAdapter class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class StateAdapter implements IStates, Constants, Serializable {

	private static final long serialVersionUID = 1L;
	private GameData game;

	/**
	 * Constructor for StateAdapter.
	 *
	 * @param g
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public StateAdapter(GameData g) {
		game = g;
	}

	/** {@inheritDoc} */
	@Override
	public IStates applyExtraActionPoint(EXTRA extra) {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates applyRallyTroops(boolean plusOne) {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates archersAttack() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates attack(String name) {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates boilingWaterAttack() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates capture() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates checkStatus() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates closeCombatAttack() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates coupure() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates drawTopCard() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates endOfTurn() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates extraActionPoint() {
		return this;
	}

	@Override
	public IStates fastMovement(boolean up) {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates finish() {
		return this;
	}

	@Override
	public IStates freeMovement(boolean up) {
		return this;
	}

	/**
	 * Getter for the field <code>game</code>.
	 *
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *         object.
	 */
	public GameData getGameData() {
		return game;
	}

	@Override
	public IStates leaveLocation() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates playAgain() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates rallyTroops() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates sabotage() {
		return this;
	}

	/**
	 * Setter for the field <code>game</code>.
	 *
	 * @param game
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public void setGame(GameData game) {
		this.game = game;
	}

	/** {@inheritDoc} */
	@Override
	public IStates start() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates StartOfTheTurn() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates supplyRaid() {
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates tunnelMovement() {
		return this;
	}
}
