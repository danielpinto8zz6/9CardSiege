package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitOptionSelectionForExtraActionPoint class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitOptionSelectionForExtraActionPoint extends StateAdapter {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AwaitOptionSelectionForExtraActionPoint.
	 *
	 * @param g
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public AwaitOptionSelectionForExtraActionPoint(GameData g) {
		super(g);
	}

	/** {@inheritDoc} */
	@Override
	public IStates applyExtraActionPoint(EXTRA extra) {

		getGameData().extraActionPoint(extra);

		getGameData().getPlayer().setCanExtraAP(false);

		return new AwaitActionSelection(getGameData());
	}

	@Override
	public IStates dont() {
		return new AwaitActionSelection(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates endOfTurn() {
		return new AwaitTopCardToBeDrawn(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates finish() {
		return new GameOver(getGameData());
	}
}
