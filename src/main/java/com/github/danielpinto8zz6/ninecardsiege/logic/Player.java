package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

/**
 * <p>
 * Player class.</p>
 *
 * @author daniel
 * @version $Id: $Id
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
     * <p>
     * Constructor for Player.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     * @param name a {@link java.lang.String} object.
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
     * <p>
     * Getter for the field <code>mSabotage</code>.</p>
     *
     * @return a int.
     */
    public int getmSabotage() {
        return mSabotage;
    }

    /**
     * <p>
     * Setter for the field <code>mSabotage</code>.</p>
     *
     * @param mSabotage a int.
     */
    public void setmSabotage(int mSabotage) {
        this.mSabotage = mSabotage;
    }

    /**
     * <p>
     * Getter for the field <code>mRallyTroops</code>.</p>
     *
     * @return a int.
     */
    public int getmRallyTroops() {
        return mRallyTroops;
    }

    /**
     * <p>
     * Setter for the field <code>mRallyTroops</code>.</p>
     *
     * @param mRallyTroops a int.
     */
    public void setmRallyTroops(int mRallyTroops) {
        this.mRallyTroops = mRallyTroops;
    }

    /**
     * <p>
     * Getter for the field <code>mCoupure</code>.</p>
     *
     * @return a int.
     */
    public int getmCoupure() {
        return mCoupure;
    }

    /**
     * <p>
     * Setter for the field <code>mCoupure</code>.</p>
     *
     * @param mCoupure a int.
     */
    public void setmCoupure(int mCoupure) {
        this.mCoupure = mCoupure;
    }

    /**
     * <p>
     * Getter for the field <code>mRaidSupplies</code>.</p>
     *
     * @return a int.
     */
    public int getmRaidSupplies() {
        return mRaidSupplies;
    }

    /**
     * <p>
     * Setter for the field <code>mRaidSupplies</code>.</p>
     *
     * @param mRaidSupplies a int.
     */
    public void setmRaidSupplies(int mRaidSupplies) {
        this.mRaidSupplies = mRaidSupplies;
    }

    /**
     * <p>
     * Getter for the field <code>gameData</code>.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
     * object.
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * <p>
     * Setter for the field <code>gameData</code>.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * <p>
     * isCanArchersAtack.</p>
     *
     * @return a boolean.
     */
    public boolean isCanArchersAtack() {
        return canArchersAtack;
    }

    /**
     * <p>
     * Setter for the field <code>canArchersAtack</code>.</p>
     *
     * @param canArchersAtack a boolean.
     */
    public void setCanArchersAtack(boolean canArchersAtack) {
        this.canArchersAtack = canArchersAtack;
    }

    /**
     * <p>
     * isCanBoilingWater.</p>
     *
     * @return a boolean.
     */
    public boolean isCanBoilingWater() {
        return canBoilingWater;
    }

    /**
     * <p>
     * Setter for the field <code>canBoilingWater</code>.</p>
     *
     * @param canBoilingWater a boolean.
     */
    public void setCanBoilingWater(boolean canBoilingWater) {
        this.canBoilingWater = canBoilingWater;
    }

    /**
     * <p>
     * isCanCloseCombat.</p>
     *
     * @return a boolean.
     */
    public boolean isCanCloseCombat() {
        return canCloseCombat;
    }

    /**
     * <p>
     * Setter for the field <code>canCloseCombat</code>.</p>
     *
     * @param canCloseCombat a boolean.
     */
    public void setCanCloseCombat(boolean canCloseCombat) {
        this.canCloseCombat = canCloseCombat;
    }

    /**
     * <p>
     * isCanCoupure.</p>
     *
     * @return a boolean.
     */
    public boolean isCanCoupure() {
        return canCoupure;
    }

    /**
     * <p>
     * Setter for the field <code>canCoupure</code>.</p>
     *
     * @param canCoupure a boolean.
     */
    public void setCanCoupure(boolean canCoupure) {
        this.canCoupure = canCoupure;
    }

    /**
     * <p>
     * isCanSupplyRaid.</p>
     *
     * @return a boolean.
     */
    public boolean isCanSupplyRaid() {
        return canSupplyRaid;
    }

    /**
     * <p>
     * Setter for the field <code>canSupplyRaid</code>.</p>
     *
     * @param canSupplyRaid a boolean.
     */
    public void setCanSupplyRaid(boolean canSupplyRaid) {
        this.canSupplyRaid = canSupplyRaid;
    }

    /**
     * <p>
     * isCanSabotage.</p>
     *
     * @return a boolean.
     */
    public boolean isCanSabotage() {
        return canSabotage;
    }

    /**
     * <p>
     * Setter for the field <code>canSabotage</code>.</p>
     *
     * @param canSabotage a boolean.
     */
    public void setCanSabotage(boolean canSabotage) {
        this.canSabotage = canSabotage;
    }

    /**
     * <p>
     * isCanExtraAP.</p>
     *
     * @return a boolean.
     */
    public boolean isCanExtraAP() {
        return canExtraAP;
    }

    /**
     * <p>
     * Setter for the field <code>canExtraAP</code>.</p>
     *
     * @param canExtraAP a boolean.
     */
    public void setCanExtraAP(boolean canExtraAP) {
        this.canExtraAP = canExtraAP;
    }

    /**
     * <p>
     * isCanRallyTroops.</p>
     *
     * @return a boolean.
     */
    public boolean isCanRallyTroops() {
        return canRallyTroops;
    }

    /**
     * <p>
     * Setter for the field <code>canRallyTroops</code>.</p>
     *
     * @param canRallyTroops a boolean.
     */
    public void setCanRallyTroops(boolean canRallyTroops) {
        this.canRallyTroops = canRallyTroops;
    }

    /**
     * <p>
     * isCanTunnelMovement.</p>
     *
     * @return a boolean.
     */
    public boolean isCanTunnelMovement() {
        return canTunnelMovement;
    }

    /**
     * <p>
     * Setter for the field <code>canTunnelMovement</code>.</p>
     *
     * @param canTunnelMovement a boolean.
     */
    public void setCanTunnelMovement(boolean canTunnelMovement) {
        this.canTunnelMovement = canTunnelMovement;
    }

    /**
     * <p>
     * Getter for the field <code>name</code>.</p>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Setter for the field <code>name</code>.</p>
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /** {@inheritDoc} */
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
     * <p>
     * Getter for the field <code>actionPoints</code>.</p>
     *
     * @return the actionPoints
     */
    public int getActionPoints() {
        return actionPoints;
    }

    /**
     * <p>
     * Setter for the field <code>actionPoints</code>.</p>
     *
     * @param actionPoints the actionPoints to set
     */
    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
    }

    /**
     * <p>
     * Getter for the field <code>moral</code>.</p>
     *
     * @return the moral
     */
    public int getMoral() {
        return moral;
    }

    /**
     * <p>
     * Setter for the field <code>moral</code>.</p>
     *
     * @param moral the moral to set
     */
    public void setMoral(int moral) {
        this.moral = moral;
    }

    /**
     * <p>
     * Getter for the field <code>wallStrength</code>.</p>
     *
     * @return the wallStrength
     */
    public int getWallStrength() {
        return wallStrength;
    }

    /**
     * <p>
     * Setter for the field <code>wallStrength</code>.</p>
     *
     * @param wallStrength the wallStrength to set
     */
    public void setWallStrength(int wallStrength) {
        this.wallStrength = wallStrength;
    }

    /**
     * <p>
     * Getter for the field <code>supplies</code>.</p>
     *
     * @return the supplies
     */
    public int getSupplies() {
        return supplies;
    }

    /**
     * <p>
     * Setter for the field <code>supplies</code>.</p>
     *
     * @param supplies the supplies to set
     */
    public void setSupplies(int supplies) {
        this.supplies = supplies;
    }

    /**
     * <p>
     * resetModifiers.</p>
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
