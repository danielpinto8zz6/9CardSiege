/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class BattleCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ladder;
    private int ram;
    private int siege_m;
    private int trebuchets;

    public BattleCard() {
        // aqui os numeros equivalem � posi��o na board, em que 4 � posi��o inicial e 0 close combat
        ladder = 4;
        ram = 4;
        siege_m = 4;
        // aqui � a quantidade de catacultas
        trebuchets = 3;
    }

    public int getLadder() {
        return ladder;
    }

    public int getRam() {
        return ram;
    }

    public int getSiege_m() {
        return siege_m;
    }

    public int getTrebuchets() {
        return trebuchets;
    }

}
