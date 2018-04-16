package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

public class BattleCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ladder;
    private int ram;
    private int siege_m;
    private int trebuchets;

    public BattleCard() {
        // aqui os numeros equivalem à posição na board, em que 4 é posição inicial e 0 close combat
        ladder = 4;
        ram = 4;
        siege_m = 4;
        // aqui é a quantidade de catacultas
        trebuchets = 3;
    }

    /**
     * @return the ladder
     */
    public int getLadder() {
        return ladder;
    }

    /**
     * @param ladder the ladder to set
     */
    public void setLadder(int ladder) {
        this.ladder = ladder;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the siege_m
     */
    public int getSiege_m() {
        return siege_m;
    }

    /**
     * @param siege_m the siege_m to set
     */
    public void setSiege_m(int siege_m) {
        this.siege_m = siege_m;
    }

    /**
     * @return the trebuchets
     */
    public int getTrebuchets() {
        return trebuchets;
    }

    /**
     * @param trebuchets the trebuchets to set
     */
    public void setTrebuchets(int trebuchets) {
        this.trebuchets = trebuchets;
    }

}
