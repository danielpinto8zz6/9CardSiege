package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class BattleCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    private final List<Enemy> enemies;

    private int trebuchet;

    /**
     *
     * @param gameData
     */
    public BattleCard(GameData gameData) {
        this.gameData = gameData;

        enemies = new ArrayList<Enemy>();

        enemies.add(new Enemy("Ladders", 2));
        enemies.add(new Enemy("BattleRam", 3));
        enemies.add(new Enemy("SiegeTower", 4));

        this.trebuchet = 3;
    }

    /**
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * @return the enemies
     */
    public List<Enemy> getEnemies() {
        return enemies;
    }

    /**
     * @return the trebuchet
     */
    public int getTrebuchet() {
        return trebuchet;
    }

    /**
     * @param trebuchet the trebuchet to set
     */
    public void setTrebuchet(int trebuchet) {
        this.trebuchet = trebuchet;
    }

    /**
     *
     * @param name
     * @return
     */
    public Enemy getEnemy(String name) {
        for (Enemy enemy : enemies) {
            if (enemy.getName() == null ? name == null : enemy.getName().equals(name)) {
                return enemy;
            }
        }
        return null;
    }

    /**
     *
     */
    public void checkCloseCombat() {
        int aux, flag = 0;
        Game game = new Game();
        while (flag == 0) {
            aux = 0;
            if (gameData.getPlayer().getActionPoints() == 0) {
                game.Finish();
            }
            for (Enemy enemy : gameData.getBattleCard().getEnemies()) {

                if (enemy.getPosition() == 0) {
                    aux++;
                }
            }
            if (aux == 3) {
                game.Finish();
            } else {
                if (aux == 2) {

                    flag = 1;
                    aux = Dice.roll();
                    if (aux == 1) {
                        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
                        gameData.getPlayer().setActionPoints(gameData.getPlayer().getActionPoints() - 1);
                    } else {
                        if (aux > 4) {
                            for (Enemy enemy : gameData.getBattleCard().getEnemies()) {
                                if (enemy.getPosition() == 0) {
                                    enemy.move(Constants.MOVE.DOWN);
                                }
                            }
                            flag = 1;
                            gameData.getPlayer().setActionPoints(gameData.getPlayer().getActionPoints() - 1);
                        } else {
                            gameData.getPlayer().setActionPoints(gameData.getPlayer().getActionPoints() - 1);
                        }
                    }

                } else {
                    flag = 1;
                }

            }
        }
    }
}
