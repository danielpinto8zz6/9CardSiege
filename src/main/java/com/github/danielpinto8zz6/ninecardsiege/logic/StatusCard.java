/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;


public class StatusCard implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private int moral;
    private int supplies;
    private int wall_s;
    private int troops;
    private int raid_s;

    public StatusCard() {
        // aqui os numeros equivalem áquantidade de um recurso inicialmente 4
        moral = 4;
        supplies = 4;
        wall_s = 4;
        //posição das tropas 0 é no castelo 1/2 tunel e 4 enemy lines
        troops= 0;
        // aqui é a quantidade de recursos raidados no maximo podem ser 2
        raid_s = 0;
    }

    public int getMoral() {
        return moral;
    }

    public int getsupplies() {
        return supplies;
    }

    public int getWall_s() {
        return wall_s;
    }

    public int getTroops() {
        return troops;
    }

    public int getRaid_S() {
        return raid_s;
    }
}
