package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.*;

/**
 * <p>
 * GameData class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private final Player player;

    private int day;

    private final BattleCard battleCard;
    private final StatusCard statusCard;

    private final List<String> msgLog;

    private List<Card> cards = new ArrayList<Card>();

    /**
     * <p>
     * Constructor for GameData.</p>
     */
    public GameData() {
        this.player = new Player(this, "Player");
        this.day = 1;

        battleCard = new BattleCard(this);
        statusCard = new StatusCard(this);

        cards.add(new Card1(this));
        cards.add(new Card2(this));
        cards.add(new Card3(this));
        cards.add(new Card4(this));
        cards.add(new Card5(this));
        cards.add(new Card6(this));
        cards.add(new Card7(this));

        shuffleCards();

        msgLog = new ArrayList<String>();
    }

    /**
     * <p>
     * Getter for the field <code>day</code>.</p>
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * <p>
     * Setter for the field <code>day</code>.</p>
     *
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * <p>
     * Getter for the field <code>battleCard</code>.</p>
     *
     * @return the battleCard
     */
    public BattleCard getBattleCard() {
        return battleCard;
    }

    /**
     * <p>
     * Getter for the field <code>statusCard</code>.</p>
     *
     * @return the statusCard
     */
    public StatusCard getStatusCard() {
        return statusCard;
    }

    /**
     * <p>
     * getEnemy.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Enemy}
     * object.
     */
    public Enemy getEnemy(String name) {
        return getBattleCard().getEnemy(name);
    }

    /**
     * <p>
     * getEnemies.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<Enemy> getEnemies() {
        return getBattleCard().getEnemies();
    }

    /**
     * <p>
     * clearMsgLog.</p>
     */
    public void clearMsgLog() {
        msgLog.clear();
    }

    /**
     * <p>
     * addMsgLog.</p>
     *
     * @param msg a {@link java.lang.String} object.
     */
    public void addMsgLog(String msg) {
        msgLog.add(msg);
    }

    /**
     * <p>
     * Getter for the field <code>msgLog</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getMsgLog() {
        return msgLog;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        String s;

        s = "Day: " + getDay();
        s += "\n\n" + getPlayer().toString();
        s += "\n\n" + "Status Card: ";
        s += "\n\t" + "Troop Position: " + getStatusCard().getTroopPosition();
        s += "\n\t" + "Supplies: " + getStatusCard().getSupplies();
        s += "\n\n" + "Battle Card: ";
        s += "\n\t" + "Trebuchet: " + getBattleCard().getTrebuchet();

        s = getEnemies().stream().map((enemy) -> "\n\n" + enemy.toString()).reduce(s, String::concat);
        
        return s;
    }

    /**
     * <p>
     * Getter for the field <code>player</code>.</p>
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * <p>
     * Getter for the field <code>cards</code>.</p>
     *
     * @return the cards
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * <p>
     * Setter for the field <code>cards</code>.</p>
     *
     * @param cards the cards to set
     */
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    private void shuffleCards() {
        Collections.shuffle(cards);
    }
}
