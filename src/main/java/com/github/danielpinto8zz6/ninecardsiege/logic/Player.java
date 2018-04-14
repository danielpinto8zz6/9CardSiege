package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

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
}
