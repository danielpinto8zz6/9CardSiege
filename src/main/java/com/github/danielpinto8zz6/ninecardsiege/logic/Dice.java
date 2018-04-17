package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.Random;

public class Dice implements Serializable {

    private static final long serialVersionUID = 1L;
    private int value;

    public Dice() {
        play();
    }

    public void play() {
        Random random = new Random();

        value = Math.abs(random.nextInt() % 6);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
