package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    private int moral;
    private int wallStrength;
    private int supplies;
    private int troops;
    private int raidSupplies;

    private List<Card> cards = new ArrayList<Card>();

    public Player(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Player : " + name;
    }

    /**
     * @return the cards
     */
    public List<Card> getCards() {
        return cards;
    }

    public int getMoral() {
        return moral;
    }

    public int getWallStrength() {
        return wallStrength;
    }

    public void setTroops(int troops) {
        this.troops = troops;
    }

    public void setRaidSupplies(int raidSupplies) {
        this.raidSupplies = raidSupplies;
    }

    public int getTroops() {
        return troops;
    }

    public int getRaidSupplies() {
        return raidSupplies;
    }

    public int getSupplies() {
        return supplies;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public void setWallStrength(int wallStrength) {
        this.wallStrength = wallStrength;
    }

    public void setSupplies(int supplies) {
        this.supplies = supplies;
    }
}
