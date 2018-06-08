package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.Random;

/**
 * Dice class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Dice {

	/**
	 * roll. returns a random number between 1 and 6
	 *
	 * @return a int.
	 */
	public static int roll() {
		int value;

		final Random random = new Random();

		value = Math.abs(random.nextInt() % 6) + 1;

		return value;
	}
}
