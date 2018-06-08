package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

/**
 * AwaitActionSelection class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitActionSelection extends StateAdapter {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AwaitActionSelection.
	 *
	 * @param g
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public AwaitActionSelection(GameData g) {
		super(g);
	}

	/** {@inheritDoc} */
	@Override
	public IStates archersAttack() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanArchersAtack()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}
		return new AwaitEnemyTrackSelectionForArchersAttack(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates boilingWaterAttack() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanBoilingWater()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}
		return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates checkStatus() {

		int value = 0;

		if (getGameData().getPlayer().getMoral() <= 0) {
			value++;
		}
		if (getGameData().getPlayer().getWallStrength() <= 0) {
			value++;
		}
		if (getGameData().getPlayer().getSupplies() <= 0) {
			value++;
		}

		if (value >= 2) {
			getGameData().addMsgLog(value + " Status at 0");
			return new GameOver(getGameData());
		}
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates closeCombatAttack() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanCloseCombat()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}

		getGameData().closeCombatAttack();

		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates coupure() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanCoupure()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}

		getGameData().coupure();

		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates endOfTurn() {
		if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 2) {
			getGameData().addMsgLog("GAME OVER! 2 Enemies in close combat area");
			return new GameOver(getGameData());
		}
		if ((getGameData().getPlayer().getMoral() == 0) || (getGameData().getPlayer().getSupplies() == 0)
				|| (getGameData().getPlayer().getWallStrength() == 0)) {
			getGameData().addMsgLog("GAME OVER! 1 status at 0");
			return new GameOver(getGameData());
		}
		final List<Card> cards = getGameData().getCards();
		if (cards.isEmpty()) {
			getGameData().setNewDay(true);

			if (getGameData().getDay() == 3) {
				getGameData().addMsgLog("Your troops arrived! GAME WON!!!!!");
				return new GameOver(getGameData());
			}
		}
		getGameData().endOfTurn();

		return new AwaitTopCardToBeDrawn(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates extraActionPoint() {
		if ((getGameData().getPlayer().getSupplies() > 0) && (getGameData().getPlayer().getMoral() > 0)
				&& getGameData().getPlayer().isCanExtraAP()) {
			return new AwaitOptionSelectionForExtraActionPoint(getGameData());
		}

		getGameData().addMsgLog("Can't add extra action points");

		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates finish() {
		return new GameOver(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates rallyTroops() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanRallyTroops()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}

		return new AwaitOptionSelectionForRallyTroops(getGameData());
	}

	/** {@inheritDoc} */
	@Override
	public IStates sabotage() {
		if (getGameData().getPlayer().getActionPoints() == 0) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}

		getGameData().sabotage();

		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates supplyRaid() {

		getGameData().supplyRaid();

		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IStates tunnelMovement() {
		if ((getGameData().getPlayer().getActionPoints() == 0) || !getGameData().getPlayer().isCanTunnelMovement()) {
			getGameData().addMsgLog("Can't perform this action");
			return this;
		}

		return new AwaitOptionForTroopsMovement(getGameData());
	}
}
