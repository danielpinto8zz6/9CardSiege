/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/** @author tiago_000 */
/**
 * <p>AwaitOptionForTroopsMovement class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitOptionForTroopsMovement extends StateAdapter {
	private static final long serialVersionUID = 1L;

	/**
	 * <p>Constructor for AwaitOptionForTroopsMovement.</p>
	 *
	 * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
	 */
	public AwaitOptionForTroopsMovement(GameData g) {
		super(g);
	}

	/** {@inheritDoc} */
	@Override
	public IStates dont() {
		return new AwaitActionSelection(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates fastMovement(boolean up) {

		getGameData().fastM(up);

		return new AwaitActionSelection(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates freeMovement(boolean up) {

		getGameData().freeM(up);

		return new AwaitActionSelection(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates leaveLocation() {
		getGameData().leaveM();
		return new AwaitActionSelection(getGameData());
	}
}
