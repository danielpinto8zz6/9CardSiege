package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.*;

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    private int moral;
    private int wallStrength;
    private int supplies;
    private int actionPoints;

    public GameData gameData;

    private List<Card> cards = new ArrayList<Card>();

    private Point coordinates;

    public Player(GameData gameData, String name) {
        this.name = name;
        this.moral = 4;
        this.wallStrength = 4;
        this.supplies = 4;
        this.actionPoints = 0;

        coordinates = new Point(0, 0);

        getNewCards();
    }

    private void getNewCards() {
        cards.clear();
        cards.add(new Card1(gameData));
        cards.add(new Card2(gameData));
        cards.add(new Card3(gameData));
        cards.add(new Card4(gameData));
        cards.add(new Card5(gameData));
        cards.add(new Card6(gameData));
        cards.add(new Card7(gameData));

        // Cards should be at random positions
        shuffleCards();
    }

    private void shuffleCards() {
        Collections.shuffle(cards);
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

    /**
     * @return the actionPoints
     */
    public int getActionPoints() {
        return actionPoints;
    }

    /**
     * @param actionPoints the actionPoints to set
     */
    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
    }

    /**
     * @return the moral
     */
    public int getMoral() {
        return moral;
    }

    /**
     * @param moral the moral to set
     */
    public void setMoral(int moral) {
        this.moral = moral;
    }

    /**
     * @return the wallStrength
     */
    public int getWallStrength() {
        return wallStrength;
    }

    /**
     * @param wallStrength the wallStrength to set
     */
    public void setWallStrength(int wallStrength) {
        this.wallStrength = wallStrength;
    }

    /**
     * @return the supplies
     */
    public int getSupplies() {
        return supplies;
    }

    public void addSupplies(int supplies) {
        this.supplies += supplies;

        if (this.supplies > 4) {
            this.supplies = 4;
        }
    }

    public void removeSupplies(int supplies) {
        this.supplies -= supplies;

        if (this.supplies < 0) {
            this.supplies = 0;
        }
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
    
    public int getX() {
        return (int) coordinates.getX();
    }

    public int getY() {
        return (int) coordinates.getY();
    }

    public void move(MOVE move) {
        int y = getY();
        int x = getX();

        if (move == MOVE.UP) {
            coordinates.move(x, y++);
        } else if (move == MOVE.DOWN) {
            coordinates.move(x, y--);
        }
    }
}
