/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/** @author tiago_000 */
public class AwaitOptionForTroopsMovement extends StateAdapter {
	private static final long serialVersionUID = 1L;

	public AwaitOptionForTroopsMovement(GameData g) {
		super(g);
	}

	@Override
	public IStates fastMovement(boolean up) {

		getGameData().fastM(up);

		return new AwaitActionSelection(getGameData());
	}

	@Override
	public IStates freeMovement(boolean up) {

		getGameData().freeM(up);

		return new AwaitActionSelection(getGameData());
	}

	@Override
	public IStates leaveLocation() {
		getGameData().leaveM();
		return new AwaitActionSelection(getGameData());
	}
}
