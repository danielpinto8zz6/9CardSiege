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
     * roll.
     *
     * @return a int.
     */
    public static int roll() {
        int value;

        Random random = new Random();

        value = Math.abs(random.nextInt() % 6);

        return value;
    }
}
