package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.*;

public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    private int day;

    private BattleCard battleCard;
    private StatusCard statusCard;

    private List<String> msgLog;

    private List<Card> cards = new ArrayList<Card>();

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
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the battleCard
     */
    public BattleCard getBattleCard() {
        return battleCard;
    }

    /**
     * @return the statusCard
     */
    public StatusCard getStatusCard() {
        return statusCard;
    }

    public Enemy getEnemy(String name) {
        return getBattleCard().getEnemy(name);
    }

    public List<Enemy> getEnemies() {
        return getBattleCard().getEnemies();
    }

    public void clearMsgLog() {
        msgLog.clear();
    }

    public void addMsgLog(String msg) {
        msgLog.add(msg);
    }

    public List<String> getMsgLog() {
        return msgLog;
    }

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

        for (Enemy enemy : getEnemies()) {
            s += "\n\n" + enemy.toString();
        }
        return s;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return the cards
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    private void shuffleCards() {
        Collections.shuffle(cards);
    }
}
