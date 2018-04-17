package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

public class StatusCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private int moral;
    private int supplies;
    private int wall_s;
    private int troops;
    private int raid_s;

    public StatusCard() {
        // aqui os numeros equivalem à quantidade de um recurso inicialmente 4
        this.moral = 4;
        this.supplies = 4;
        this.wall_s = 4;
        //posição das tropas 0 é no castelo 1/2 tunel e 4 enemy lines
        this.troops = 0;
        // aqui é a quantidade de recursos raidados no maximo podem ser 2
        this.raid_s = 0;
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
     * @return the wall_s
     */
    public int getWall_s() {
        return wall_s;
    }

    /**
     * @param wall_s the wall_s to set
     */
    public void setWall_s(int wall_s) {
        this.wall_s = wall_s;
    }

    /**
     * @return the troops
     */
    public int getTroops() {
        return troops;
    }

    /**
     * @param troops the troops to set
     */
    public void setTroops(int troops) {
        this.troops = troops;
    }

    /**
     * @return the raid_s
     */
    public int getRaid_s() {
        return raid_s;
    }

    /**
     * @param raid_s the raid_s to set
     */
    public void setRaid_s(int raid_s) {
        this.raid_s = raid_s;
    }
}
