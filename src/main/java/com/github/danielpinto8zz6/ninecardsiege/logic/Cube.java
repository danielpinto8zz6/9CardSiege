package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class Cube implements Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    // Enviamos o jogador para saber a que jogador pertence o cubo
    public Cube(Player player) {
        this.player = player;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "" + player.getName();
    }
}
