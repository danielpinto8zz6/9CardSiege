package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.Random;

public class Dice {
    public static int roll() {
        int value;

        Random random = new Random();

        value = Math.abs(random.nextInt() % 6);

        return value;
    }
}