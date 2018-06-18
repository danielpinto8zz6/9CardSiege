package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE;

/**
 * Enemy class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Enemy implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private final int initialStrength;
	private int strength;
	private int position;

	/**
	 * Constructor for Enemy.
	 *
	 * @param name
	 *            a {@link java.lang.String} object.
	 * @param strength
	 *            a int.
	 */
	public Enemy(String name, int strength) {
		this.name = name;
		this.strength = strength;
		position = 4;
		initialStrength = strength;
	}

	/**
	 * Getter for the field <code>initialStrength</code>. returns the initial
	 * strenght of the enemy
	 *
	 * @return a int.
	 */
	public int getInitialStrength() {
		return initialStrength;
	}

	/**
	 * Getter for the field <code>name</code>.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the field <code>position</code>.
	 *
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Getter for the field <code>strength</code>.
	 *
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * move. Reveices an enum indicating where to move and move the enemy to that
	 * position (UP or DOWN)
	 *
	 * @param move
	 *            a
	 *            {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE}
	 *            object.
	 */
	public void move(MOVE move) {
		if (move == MOVE.UP) {
			position--;
		} else if (move == MOVE.DOWN) {
			position++;
		}
		if (position > 4) {
			position = 4;
		} else if (position < 0) {
			position = 0;
		}
	}

	/**
	 * reset.
	 */
	public void reset() {
		strength = initialStrength;
		position = 4;
	}

	/**
	 * resetStrenght. Resets the strength
	 */
	public void resetStrenght() {
		if (position != 0) {

			strength = getInitialStrength();
		}
	}

	/**
	 * Setter for the field <code>name</code>.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the field <code>position</code>.
	 *
	 * @param position
	 *            the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * Setter for the field <code>strength</code>.
	 *
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		String s;

		s = "Enemy: " + getName();
		s += "\n\t" + "Strength: " + getStrength();
		s += "\n\t" + "Position: " + getPosition();
		return s;
	}
}
