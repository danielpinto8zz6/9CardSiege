package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

/**
 * Player class.
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

	/** These booleans indicate if the player can or not do the specified action */
	private boolean canArchersAtack;

	private boolean canBoilingWater;
	private boolean canCloseCombat;
	private boolean canCoupure;
	private boolean canExtraAP;
	private boolean canRallyTroops;
	private boolean canTunnelMovement;

	private int mSabotage;
	private int mRallyTroops;
	private int mCoupure;
	private int mRaidSupplies;

	/** */
	private GameData gameData;

	/**
	 * Constructor for Player.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public Player(GameData gameData, String name) {

		/** Set all the initial values */
		this.name = name;
		moral = 4;
		wallStrength = 4;
		supplies = 4;
		actionPoints = 0;
		canArchersAtack = true;
		canBoilingWater = true;
		canCloseCombat = true;
		canCoupure = true;
		canExtraAP = true;
		canRallyTroops = true;
		canTunnelMovement = true;
		mCoupure = 0;
		mRallyTroops = 0;
		mRaidSupplies = 0;
		mSabotage = 0;
	}

	/**
	 * Getter for the field <code>actionPoints</code>.
	 *
	 * @return the actionPoints
	 */
	public int getActionPoints() {
		return actionPoints;
	}

	/**
	 * Getter for the field <code>gameData</code>.
	 *
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *         object.
	 */
	public GameData getGameData() {
		return gameData;
	}

	/**
	 * Getter for the field <code>mCoupure</code>.
	 *
	 * @return a int.
	 */
	public int getmCoupure() {
		return mCoupure;
	}

	/**
	 * Getter for the field <code>moral</code>.
	 *
	 * @return the moral
	 */
	public int getMoral() {
		return moral;
	}

	/**
	 * Getter for the field <code>mRaidSupplies</code>.
	 *
	 * @return a int.
	 */
	public int getmRaidSupplies() {
		return mRaidSupplies;
	}

	/**
	 * Getter for the field <code>mRallyTroops</code>.
	 *
	 * @return a int.
	 */
	public int getmRallyTroops() {
		return mRallyTroops;
	}

	/**
	 * Getter for the field <code>mSabotage</code>.
	 *
	 * @return a int.
	 */
	public int getmSabotage() {
		return mSabotage;
	}

	/**
	 * Getter for the field <code>name</code>.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the field <code>supplies</code>.
	 *
	 * @return the supplies
	 */
	public int getSupplies() {
		return supplies;
	}

	/**
	 * Getter for the field <code>wallStrength</code>.
	 *
	 * @return the wallStrength
	 */
	public int getWallStrength() {
		return wallStrength;
	}

	/**
	 * isCanArchersAtack.
	 *
	 * @return a boolean.
	 */
	public boolean isCanArchersAtack() {
		return canArchersAtack;
	}

	/**
	 * isCanBoilingWater.
	 *
	 * @return a boolean.
	 */
	public boolean isCanBoilingWater() {
		return canBoilingWater;
	}

	/**
	 * isCanCloseCombat.
	 *
	 * @return a boolean.
	 */
	public boolean isCanCloseCombat() {
		return canCloseCombat;
	}

	/**
	 * isCanCoupure.
	 *
	 * @return a boolean.
	 */
	public boolean isCanCoupure() {
		return canCoupure;
	}

	/**
	 * isCanExtraAP.
	 *
	 * @return a boolean.
	 */
	public boolean isCanExtraAP() {
		return canExtraAP;
	}

	/**
	 * isCanRallyTroops.
	 *
	 * @return a boolean.
	 */
	public boolean isCanRallyTroops() {
		return canRallyTroops;
	}

	/**
	 * isCanTunnelMovement.
	 *
	 * @return a boolean.
	 */
	public boolean isCanTunnelMovement() {
		return canTunnelMovement;
	}

	/**
	 * reset.
	 */
	public void reset() {
		moral = 4;
		wallStrength = 4;
		supplies = 4;
		actionPoints = 0;
		canArchersAtack = true;
		canBoilingWater = true;
		canCloseCombat = true;
		canCoupure = true;
		canExtraAP = true;
		canRallyTroops = true;
		canTunnelMovement = true;
		mCoupure = 0;
		mRallyTroops = 0;
		mRaidSupplies = 0;
		mSabotage = 0;
	}

	/**
	 * resetModifiers. Set all the modifiers to their initial state
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
		setCanExtraAP(true);
		setCanRallyTroops(true);
		setCanTunnelMovement(true);
	}

	/**
	 * Setter for the field <code>actionPoints</code>.
	 *
	 * @param actionPoints
	 *            the actionPoints to set
	 */
	public void setActionPoints(int actionPoints) {
		this.actionPoints = actionPoints;
	}

	/**
	 * Setter for the field <code>canArchersAtack</code>.
	 *
	 * @param canArchersAtack
	 *            a boolean.
	 */
	public void setCanArchersAtack(boolean canArchersAtack) {
		this.canArchersAtack = canArchersAtack;
	}

	/**
	 * Setter for the field <code>canBoilingWater</code>.
	 *
	 * @param canBoilingWater
	 *            a boolean.
	 */
	public void setCanBoilingWater(boolean canBoilingWater) {
		this.canBoilingWater = canBoilingWater;
	}

	/**
	 * Setter for the field <code>canCloseCombat</code>.
	 *
	 * @param canCloseCombat
	 *            a boolean.
	 */
	public void setCanCloseCombat(boolean canCloseCombat) {
		this.canCloseCombat = canCloseCombat;
	}

	/**
	 * Setter for the field <code>canCoupure</code>.
	 *
	 * @param canCoupure
	 *            a boolean.
	 */
	public void setCanCoupure(boolean canCoupure) {
		this.canCoupure = canCoupure;
	}

	/**
	 * Setter for the field <code>canExtraAP</code>.
	 *
	 * @param canExtraAP
	 *            a boolean.
	 */
	public void setCanExtraAP(boolean canExtraAP) {
		this.canExtraAP = canExtraAP;
	}

	/**
	 * Setter for the field <code>canRallyTroops</code>.
	 *
	 * @param canRallyTroops
	 *            a boolean.
	 */
	public void setCanRallyTroops(boolean canRallyTroops) {
		this.canRallyTroops = canRallyTroops;
	}

	/**
	 * Setter for the field <code>canTunnelMovement</code>.
	 *
	 * @param canTunnelMovement
	 *            a boolean.
	 */
	public void setCanTunnelMovement(boolean canTunnelMovement) {
		this.canTunnelMovement = canTunnelMovement;
	}

	/**
	 * Setter for the field <code>gameData</code>.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public void setGameData(GameData gameData) {
		this.gameData = gameData;
	}

	/**
	 * Setter for the field <code>mCoupure</code>.
	 *
	 * @param mCoupure
	 *            a int.
	 */
	public void setmCoupure(int mCoupure) {
		this.mCoupure = mCoupure;
	}

	/**
	 * Setter for the field <code>moral</code>.
	 *
	 * @param moral
	 *            the moral to set
	 */
	public void setMoral(int moral) {
		this.moral = moral;
	}

	/**
	 * Setter for the field <code>mRaidSupplies</code>.
	 *
	 * @param mRaidSupplies
	 *            a int.
	 */
	public void setmRaidSupplies(int mRaidSupplies) {
		this.mRaidSupplies = mRaidSupplies;
	}

	/**
	 * Setter for the field <code>mRallyTroops</code>.
	 *
	 * @param mRallyTroops
	 *            a int.
	 */
	public void setmRallyTroops(int mRallyTroops) {
		this.mRallyTroops = mRallyTroops;
	}

	/**
	 * Setter for the field <code>mSabotage</code>.
	 *
	 * @param mSabotage
	 *            a int.
	 */
	public void setmSabotage(int mSabotage) {
		this.mSabotage = mSabotage;
	}

	/**
	 * Setter for the field <code>name</code>.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the field <code>supplies</code>.
	 *
	 * @param supplies
	 *            the supplies to set
	 */
	public void setSupplies(int supplies) {
		this.supplies = supplies;
	}

	/**
	 * Setter for the field <code>wallStrength</code>.
	 *
	 * @param wallStrength
	 *            the wallStrength to set
	 */
	public void setWallStrength(int wallStrength) {
		this.wallStrength = wallStrength;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		String s;

		s = "Player: " + getName();
		s += "\n\n\t" + "Moral: " + getMoral();
		s += "\n\t" + "Wall Strength: " + getWallStrength();
		s += "\n\t" + "Supplies: " + getSupplies();
		s += "\n\t" + "Ation Points: " + getActionPoints();
		return s;
	}
}
