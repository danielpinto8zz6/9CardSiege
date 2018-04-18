package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.awt.Point;
import java.io.Serializable;

public class Enemy implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int strength;
    private Point coordinates;

    public Enemy(String name, int strength, Point coordinates) {
        this.name = name;
        this.strength = strength;
        this.coordinates = coordinates;
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
     * @return the coordinates
     */
    public Point getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates the coordinates to set
     */
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
}
