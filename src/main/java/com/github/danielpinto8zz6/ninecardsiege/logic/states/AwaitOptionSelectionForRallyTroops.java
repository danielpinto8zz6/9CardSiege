package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitOptionSelectionForRallyTroops class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitOptionSelectionForRallyTroops extends StateAdapter {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AwaitOptionSelectionForRallyTroops.
	 *
	 * @param g
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public AwaitOptionSelectionForRallyTroops(GameData g) {
		super(g);
	}

	/** {@inheritDoc} */
	@Override
	public IStates applyRallyTroops(boolean plusOne) {

		getGameData().rallyTroops(plusOne);

		return new AwaitActionSelection(getGameData());
	}

	@Override
	public IStates dont() {
		return new AwaitActionSelection(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates finish() {
		return new GameOver(getGameData());
	}
}
