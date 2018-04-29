package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

/**
 *
 * @author daniel
 */
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

    /**
     *
     */
    public GameData gameData;

    /**
     *
     * @param gameData
     * @param name
     */
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
    }

    /**
     *
     * @return
     */
    public int getmSabotage() {
        return mSabotage;
    }

    /**
     *
     * @param mSabotage
     */
    public void setmSabotage(int mSabotage) {
        this.mSabotage = mSabotage;
    }

    /**
     *
     * @return
     */
    public int getmRallyTroops() {
        return mRallyTroops;
    }

    /**
     *
     * @param mRallyTroops
     */
    public void setmRallyTroops(int mRallyTroops) {
        this.mRallyTroops = mRallyTroops;
    }

    /**
     *
     * @return
     */
    public int getmCoupure() {
        return mCoupure;
    }

    /**
     *
     * @param mCoupure
     */
    public void setmCoupure(int mCoupure) {
        this.mCoupure = mCoupure;
    }

    /**
     *
     * @return
     */
    public int getmRaidSupplies() {
        return mRaidSupplies;
    }

    /**
     *
     * @param mRaidSupplies
     */
    public void setmRaidSupplies(int mRaidSupplies) {
        this.mRaidSupplies = mRaidSupplies;
    }

    /**
     *
     * @return
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     *
     * @param gameData
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     *
     * @return
     */
    public boolean isCanArchersAtack() {
        return canArchersAtack;
    }

    /**
     *
     * @param canArchersAtack
     */
    public void setCanArchersAtack(boolean canArchersAtack) {
        this.canArchersAtack = canArchersAtack;
    }

    /**
     *
     * @return
     */
    public boolean isCanBoilingWater() {
        return canBoilingWater;
    }

    /**
     *
     * @param canBoilingWater
     */
    public void setCanBoilingWater(boolean canBoilingWater) {
        this.canBoilingWater = canBoilingWater;
    }

    /**
     *
     * @return
     */
    public boolean isCanCloseCombat() {
        return canCloseCombat;
    }

    /**
     *
     * @param canCloseCombat
     */
    public void setCanCloseCombat(boolean canCloseCombat) {
        this.canCloseCombat = canCloseCombat;
    }

    /**
     *
     * @return
     */
    public boolean isCanCoupure() {
        return canCoupure;
    }

    /**
     *
     * @param canCoupure
     */
    public void setCanCoupure(boolean canCoupure) {
        this.canCoupure = canCoupure;
    }

    /**
     *
     * @return
     */
    public boolean isCanSupplyRaid() {
        return canSupplyRaid;
    }

    /**
     *
     * @param canSupplyRaid
     */
    public void setCanSupplyRaid(boolean canSupplyRaid) {
        this.canSupplyRaid = canSupplyRaid;
    }

    /**
     *
     * @return
     */
    public boolean isCanSabotage() {
        return canSabotage;
    }

    /**
     *
     * @param canSabotage
     */
    public void setCanSabotage(boolean canSabotage) {
        this.canSabotage = canSabotage;
    }

    /**
     *
     * @return
     */
    public boolean isCanExtraAP() {
        return canExtraAP;
    }

    /**
     *
     * @param canExtraAP
     */
    public void setCanExtraAP(boolean canExtraAP) {
        this.canExtraAP = canExtraAP;
    }

    /**
     *
     * @return
     */
    public boolean isCanRallyTroops() {
        return canRallyTroops;
    }

    /**
     *
     * @param canRallyTroops
     */
    public void setCanRallyTroops(boolean canRallyTroops) {
        this.canRallyTroops = canRallyTroops;
    }

    /**
     *
     * @return
     */
    public boolean isCanTunnelMovement() {
        return canTunnelMovement;
    }

    /**
     *
     * @param canTunnelMovement
     */
    public void setCanTunnelMovement(boolean canTunnelMovement) {
        this.canTunnelMovement = canTunnelMovement;
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
     *
     * @return
     */
    @Override
    public String toString() {
        String s;

        s = "Player: " + getName();
        s += "\n\n\t" + "Moral: " + getMoral();
        s += "\n\t" + "Wall Strength: " + getWallStrength();
        s += "\n\t" + "Supplies: " + getSupplies();
        return s;
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

    /**
     *
     */
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
