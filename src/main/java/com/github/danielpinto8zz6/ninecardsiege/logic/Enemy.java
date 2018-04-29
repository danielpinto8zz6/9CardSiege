package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE;

/**
 *
 * @author daniel
 */
public class Enemy implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int strength;
    private int position;

    /**
     *
     * @param name
     * @param strength
     */
    public Enemy(String name, int strength) {
        this.name = name;
        this.strength = strength;
        this.position = 4;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     *
     * @param move
     */
    public void move(MOVE move) {
        if (move == MOVE.UP) {
            this.position--;
        } else if (move == MOVE.DOWN) {
            this.position++;
        }
        if (this.position > 4) {
            this.position = 4;
        } else if (this.position < 0) {
            this.position = 0;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String s;

        s = "Enemy: " + getName();
        s += "\n\t" + "Strength: " + getStrength();
        s += "\n\t" + "Position: " + getPosition();
        return s;
    }
}
