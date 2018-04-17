package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    private static int counter = 0;
    private int cardNumber;

    public Card() {
        cardNumber = ++counter;
    }

    /**
     * @return the cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }


}
