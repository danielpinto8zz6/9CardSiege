package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    private int day;

    private BattleCard battleCard;
    private StatusCard statusCard;

    private List<String> msgLog;

    public GameData() {
        this.player = new Player(this, "Player");
        this.day = 1;

        battleCard = new BattleCard(this);
        statusCard = new StatusCard(this);

        msgLog = new ArrayList<String>();
    }

    /**
     * @return the players
     */
    public Player getPlayer() {
        return this.player;
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
}
