package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.Random;

/**
 * <p>Dice class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Dice {

    /**
     * <p>roll.</p>
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
