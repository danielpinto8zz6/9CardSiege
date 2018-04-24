package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.*;

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    private int moral;
    private int wallStrength;
    private int supplies;
    private int actionPoints;
    private boolean canArchersAtack;
    private boolean canBoilingWater;
    private boolean canCloseCombat;
    private boolean canCoupure;
    private boolean canSupplyRaid;
    private boolean canSabotage;
    private boolean canExtraAP;
    private boolean canRallyTroops;
    private boolean canTunnelMovement;
    private int mSabotage;
    private int mRallyTroops;
    private int mCoupure;
    private int mRaidSupplies;

    public GameData gameData;

    private List<Card> cards = new ArrayList<Card>();

    public Player(GameData gameData, String name) {
        this.name = name;
        this.moral = 4;
        this.wallStrength = 4;
        this.supplies = 4;
        this.actionPoints = 0;
        this.canArchersAtack = true;
        this.canBoilingWater = true;
        this.canCloseCombat = true;
        this.canCoupure = true;
        this.canExtraAP = true;
        this.canSupplyRaid = true;
        this.canSabotage = true;
        this.canRallyTroops = true;
        this.canTunnelMovement = true;
        this.mCoupure = 0;
        this.mRallyTroops = 0;
        this.mRaidSupplies = 0;
        this.mSabotage = 0;

        getNewCards();
    }

    public int getmSabotage() {
        return mSabotage;
    }

    public void setmSabotage(int mSabotage) {
        this.mSabotage = mSabotage;
    }

    public int getmRallyTroops() {
        return mRallyTroops;
    }

    public void setmRallyTroops(int mRallyTroops) {
        this.mRallyTroops = mRallyTroops;
    }

    public int getmCoupure() {
        return mCoupure;
    }

    public void setmCoupure(int mCoupure) {
        this.mCoupure = mCoupure;
    }

    public int getmRaidSupplies() {
        return mRaidSupplies;
    }

    public void setmRaidSupplies(int mRaidSupplies) {
        this.mRaidSupplies = mRaidSupplies;
    }

    public GameData getGameData() {
        return gameData;
    }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    public boolean isCanArchersAtack() {
        return canArchersAtack;
    }

    public void setCanArchersAtack(boolean canArchersAtack) {
        this.canArchersAtack = canArchersAtack;
    }

    public boolean isCanBoilingWater() {
        return canBoilingWater;
    }

    public void setCanBoilingWater(boolean canBoilingWater) {
        this.canBoilingWater = canBoilingWater;
    }

    public boolean isCanCloseCombat() {
        return canCloseCombat;
    }

    public void setCanCloseCombat(boolean canCloseCombat) {
        this.canCloseCombat = canCloseCombat;
    }

    public boolean isCanCoupure() {
        return canCoupure;
    }

    public void setCanCoupure(boolean canCoupure) {
        this.canCoupure = canCoupure;
    }

    public boolean isCanSupplyRaid() {
        return canSupplyRaid;
    }

    public void setCanSupplyRaid(boolean canSupplyRaid) {
        this.canSupplyRaid = canSupplyRaid;
    }

    public boolean isCanSabotage() {
        return canSabotage;
    }

    public void setCanSabotage(boolean canSabotage) {
        this.canSabotage = canSabotage;
    }

    public boolean isCanExtraAP() {
        return canExtraAP;
    }

    public void setCanExtraAP(boolean canExtraAP) {
        this.canExtraAP = canExtraAP;
    }

    public boolean isCanRallyTroops() {
        return canRallyTroops;
    }

    public void setCanRallyTroops(boolean canRallyTroops) {
        this.canRallyTroops = canRallyTroops;
    }

    public boolean isCanTunnelMovement() {
        return canTunnelMovement;
    }

    public void setCanTunnelMovement(boolean canTunnelMovement) {
        this.canTunnelMovement = canTunnelMovement;
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

    /**
     * @param supplies the supplies to set
     */
    public void setSupplies(int supplies) {
        this.supplies = supplies;
    }

    public void resetModifiers() {
        setmSabotage(0);
        setmRallyTroops(0);
        setmCoupure(0);
        setmRaidSupplies(0);
        setCanArchersAtack(true);
        setCanBoilingWater(true);
        setCanCloseCombat(true);
        setCanCoupure(true);
        setCanSupplyRaid(true);
        setCanSabotage(true);
        setCanExtraAP(true);
        setCanRallyTroops(true);
        setCanTunnelMovement(true);
    }

}