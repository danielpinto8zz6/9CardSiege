package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card1;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card2;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card3;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card4;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card5;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card6;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card7;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

/**
 * GameData class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public final class GameData implements Constants, Serializable {

	private static final long serialVersionUID = 1L;

	private final Player player;

	private int day;
	private int numCard;

	private boolean endGame;
	private boolean newDay;
	private boolean freeM;

	private final BattleCard battleCard;
	private final StatusCard statusCard;

	/**
	 * This vector of string aggregate all the game logs to eventually be displayed
	 * by the game UI
	 */
	private final List<String> msgLog;

	private List<Card> cards = new ArrayList<>();

	/** Constructor for GameData. */
	public GameData() {

		/** Creates player with default name */
		player = new Player(this, "Player");
		day = 1;
		endGame = false;
		newDay = false;
		battleCard = new BattleCard(this);
		statusCard = new StatusCard(this);

		addCards();

		shuffleCards();

		msgLog = new ArrayList<>();
	}

	/** addCards. Adds all the existing cards to the game */
	public void addCards() {
		cards.add(new Card1(this));
		cards.add(new Card2(this));
		cards.add(new Card3(this));
		cards.add(new Card4(this));
		cards.add(new Card5(this));
		cards.add(new Card6(this));
		cards.add(new Card7(this));
	}

	/**
	 * addMsgLog.
	 *
	 * @param msg
	 *            a {@link java.lang.String} object.
	 */
	public void addMsgLog(String msg) {
		msgLog.add(msg);
	}

	public void archersAttack(String name) {
		final int roll = Dice.roll();

		Enemy enemy;
		try {
			enemy = getEnemy(name);

			addMsgLog("Performing ArchersAttack");
			addMsgLog("Roll : " + roll);

			if (enemy.getStrength() < roll) {
				enemy.move(Constants.MOVE.DOWN);
			}

			getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
		} catch (final EnemyNotFoundException e) {
			addMsgLog(e.getMessage());
		}
	}

	public void boilingWaterAttack(String name) {
		final int roll = Dice.roll();

		Enemy enemy;

		try {
			enemy = getEnemy(name);

			addMsgLog("Performing Boilin Water Attack");
			addMsgLog("Roll : " + roll);

			if (enemy.getStrength() < (roll + 2)) {
				enemy.move(Constants.MOVE.DOWN);
			}
			getPlayer().setCanBoilingWater(false);
			getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
		} catch (final EnemyNotFoundException e) {
			addMsgLog(e.getMessage());
		}
	}

	/** clearMsgLog. */
	public void clearMsgLog() {
		msgLog.clear();
	}

	public void closeCombatAttack() {
		final int roll = Dice.roll();

		addMsgLog("close combat roll" + roll);

		if (roll == 1) {
			if (getPlayer().getMoral() >= 1) {
				getPlayer().setMoral(getPlayer().getMoral() - 1);
			}
		} else if (roll > 4) {
			getBattleCard().getEnemiesInCloseCombatArea().forEach((enemy) -> {
				enemy.move(Constants.MOVE.DOWN);
			});
		}
		getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
	}

	public void coupure() {
		final int roll = Dice.roll();

		addMsgLog("rolled " + roll + " on coupure");

		if (roll > 4) {
			getPlayer().setWallStrength(getPlayer().getWallStrength() + 1);
		}

		getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
	}

	public void endOfTurn() {

		if (newDay) {
			addMsgLog("New day! Shuffeling cards");
			addCards();
			shuffleCards();
			setDay(getDay() + 1);

			if (getStatusCard().getTroopPosition() == 4) {
				addMsgLog("Your troops have been captured!\n" + "They here in enemy lines at the end of the day");

				getStatusCard().setTroopPosition(0);
				if (getPlayer().getMoral() >= 1) {
					getPlayer().setMoral(getPlayer().getMoral() - 1);
				}

			} else {
				addMsgLog("Your troops arived at the castle");
				getStatusCard().setTroopPosition(0);
				getPlayer().setSupplies(getPlayer().getSupplies() + getStatusCard().getSupplies());
				getStatusCard().removeSupplies();
			}
			newDay = false;
		}
		/** Reset player modifiers */
		getPlayer().resetModifiers();

		/** Reset enemies strength */
		getEnemies().forEach((enemy) -> {
			enemy.resetStrenght();
		});
	}

	public void extraActionPoint(EXTRA extra) {
		getPlayer().setActionPoints(getPlayer().getActionPoints() + 1);
		switch (extra) {
		case MORAL:
			getPlayer().setMoral(getPlayer().getMoral() - 1);
			break;
		case SUPPLIES:
			getPlayer().setSupplies(getPlayer().getSupplies() - 1);
			break;
		}
	}

	public void fastM(boolean up) {

		if ((getStatusCard().getTroopPosition() == 0) || (getStatusCard().getTroopPosition() == 3)) {
			addMsgLog("Can't do this movement... ");
		} else if (up) {
			getStatusCard().setTroopPosition(getStatusCard().getTroopPosition() - 1);
			getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
			addMsgLog("movement done, going to the castle ");

		} else {
			getStatusCard().setTroopPosition(getStatusCard().getTroopPosition() + 1);
			getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);

			addMsgLog("movement done, going to the enemi lines ");
		}
	}

	public void freeM(boolean up) {

		if ((getStatusCard().getFreeMov() != 1)
				|| ((getStatusCard().getTroopPosition() == 0) || (getStatusCard().getTroopPosition() == 3))) {
			addMsgLog("Can't do this movement... ");

		} else if (up) {
			getStatusCard().setTroopPosition(getStatusCard().getTroopPosition() - 1);
			addMsgLog("movement done, going to the castle ");

		} else {
			getStatusCard().setTroopPosition(getStatusCard().getTroopPosition() + 1);
			addMsgLog("movement done, going to the enemi lines ");
		}
	}

	/**
	 * Getter for the field <code>battleCard</code>.
	 *
	 * @return the battleCard
	 */
	public BattleCard getBattleCard() {
		return battleCard;
	}

	/**
	 * Getter for the field <code>cards</code>.
	 *
	 * @return the cards
	 */
	public List<Card> getCards() {
		return cards;
	}

	/**
	 * Getter for the field <code>day</code>.
	 *
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * getEnemies.
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Enemy> getEnemies() {
		return getBattleCard().getEnemies();
	}

	/**
	 * getEnemy.
	 *
	 * @param name
	 *            a {@link java.lang.String} object.
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Enemy}
	 *         object.
	 * @throws com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException
	 *             if any.
	 */
	public Enemy getEnemy(String name) throws EnemyNotFoundException {
		return getBattleCard().getEnemy(name);
	}

	/**
	 * Getter for the field <code>msgLog</code>.
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getMsgLog() {
		return msgLog;
	}

	public int getNumCard() {
		return numCard;
	}

	/**
	 * Getter for the field <code>player</code>.
	 *
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Getter for the field <code>statusCard</code>.
	 *
	 * @return the statusCard
	 */
	public StatusCard getStatusCard() {
		return statusCard;
	}

	/**
	 * isEndGame.
	 *
	 * @return a boolean.
	 */
	public boolean isEndGame() {
		return endGame;
	}

	public boolean isFreeM() {
		return freeM;
	}

	public boolean isNewDay() {
		return newDay;
	}

	/*
	 * public void tunnelMovement() { if (getStatusCard().getTroopPosition() == 0) {
	 * getStatusCard().setTroopPosition(1); getStatusCard().setDirection(0); } else
	 * if (getStatusCard().getTroopPosition() == 3) {
	 * getStatusCard().setTroopPosition(2); getStatusCard().setDirection(1); } else
	 * if (getStatusCard().getDirection() == 0) {
	 * getStatusCard().setTroopPosition(3); } else {
	 * getStatusCard().setTroopPosition(0);
	 * getPlayer().setSupplies(getPlayer().getSupplies() +
	 * getStatusCard().getSupplies()); getStatusCard().removeSupplies(); if
	 * (getPlayer().getSupplies() > 4) { getPlayer().setSupplies(4); } }
	 *
	 * getPlayer().setActionPoints(getPlayer().getActionPoints() - 1); }
	 */

	public void leaveM() {

		if ((getStatusCard().getTroopPosition() == 0) || (getStatusCard().getTroopPosition() == 3)) {
			if (getStatusCard().getTroopPosition() == 0) {
				addMsgLog("Movement executed leaving the castle ");
				getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
				getStatusCard().setTroopPosition(1);
				getStatusCard().setFreeMov(2);
			} else {
				getStatusCard().setTroopPosition(2);
				getStatusCard().setFreeMov(2);

				addMsgLog("Movement executed leaving the enemy lines ");
				getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
			}

		} else {
			addMsgLog("Can't do this movement... ");
		}
	}

	public void rallyTroops(boolean plusOne) {
		int roll = Dice.roll();
		addMsgLog("rolled" + roll + "on rally troops");

		if (plusOne) {
			roll++;
			getPlayer().setSupplies(getPlayer().getSupplies() - 1);
		}

		if (roll > 4) {
			getPlayer().setMoral(getPlayer().getMoral() + 1);
			if (getPlayer().getMoral() > 4) {
				getPlayer().setMoral(4);
			}
		}

		getPlayer().setActionPoints(getPlayer().getActionPoints() - 1);
	}

	/** reset. */
	public void reset() {
		day = 1;

		getCards().clear();

		addCards();

		shuffleCards();

		getBattleCard().reset();
		getStatusCard().reset();
		getPlayer().reset();
	}

	public void sabotage() {
		if (getStatusCard().getTroopPosition() == 3) {
			final int roll = Dice.roll();
			if (roll > 4) {
				final int trebuchet = (getBattleCard().getTrebuchet() - 1);
				getBattleCard().setTrebuchet(trebuchet > 0 ? trebuchet : 0);
				addMsgLog("Reduce trebuchet by 1 (min 0)");
			} else if (roll == 1) {
				getPlayer().setMoral(getPlayer().getMoral() - 1);
				getStatusCard().setTroopPosition(0);
				getStatusCard().removeSupplies();
				addMsgLog("Reduce moral by 1\nTroops captured\nRemoved supplies");
			}
		}
		addMsgLog("Can't perform Sabotage");

	}

	/**
	 * Setter for the field <code>cards</code>.
	 *
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Setter for the field <code>day</code>.
	 *
	 * @param day
	 *            the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Setter for the field <code>endGame</code>.
	 *
	 * @param endGame
	 *            a boolean.
	 */
	public void setEndGame(boolean endGame) {
		this.endGame = endGame;
	}

	public void setFreeM(boolean freeM) {
		this.freeM = freeM;
	}

	public void setNewDay(boolean newDay) {
		this.newDay = newDay;
	}

	public void setNumCard(int numCard) {
		this.numCard = numCard;
	}

	/**
	 * shuffleCards. Shuffle all the existing cards in the deck (list) with the
	 * collections method
	 */
	public void shuffleCards() {
		Collections.shuffle(cards);
	}

	public void supplyRaid() {
		if (getStatusCard().getTroopPosition() == 3) {
			final int roll = Dice.roll();
			switch (roll) {
			case 1:
				if (getPlayer().getMoral() >= 1) {
					getPlayer().setMoral(getPlayer().getMoral() - 1);
				}
				getStatusCard().setTroopPosition(0);
				getStatusCard().removeSupplies();
				addMsgLog("Reduce moral by 1\nTroops captured\nRemoved supplies");
				break;
			case 3:
			case 4:
			case 5:
				getStatusCard().addSupplies(1);
				addMsgLog("Added 1 supply (max 2)");
				break;
			case 6:
				getStatusCard().addSupplies(2);
				addMsgLog("Added 2 supplies (max 2)");
				break;
			default:
				break;
			}
		} else {
			addMsgLog("Can't perform Supply Raid");
		}
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		String s;

		s = "Day: " + getDay();
		s += "\n\n" + getPlayer().toString();
		s += "\n\n" + getStatusCard().toString();
		s += "\n\n" + getBattleCard().toString();

		s = getEnemies().stream().map((enemy) -> "\n\n" + enemy.toString()).reduce(s, String::concat);

		return s;
	}
}
