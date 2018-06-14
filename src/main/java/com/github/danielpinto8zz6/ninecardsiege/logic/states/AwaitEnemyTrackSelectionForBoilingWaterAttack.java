package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitEnemyTrackSelectionForBoilingWaterAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForBoilingWaterAttack extends StateAdapter {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AwaitEnemyTrackSelectionForBoilingWaterAttack.
	 *
	 * @param g
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public AwaitEnemyTrackSelectionForBoilingWaterAttack(GameData g) {
		super(g);
	}

	/** {@inheritDoc} */
	@Override
	public IStates attack(String name) {

		getGameData().boilingWaterAttack(name);

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
