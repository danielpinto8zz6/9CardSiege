package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * BattleCard class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BattleCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    private final List<Enemy> enemies;

    private int trebuchet;

    /**
     * <p>
     * Constructor for BattleCard.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public BattleCard(GameData gameData) {
        this.gameData = gameData;

        enemies = new ArrayList<>();

        enemies.add(new Enemy("Ladders", 2));
        enemies.add(new Enemy("BattleRam", 3));
        enemies.add(new Enemy("SiegeTower", 4));

        this.trebuchet = 3;
    }

    /**
     * <p>
     * Getter for the field <code>gameData</code>.</p>
     *
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * <p>
     * Setter for the field <code>gameData</code>.</p>
     *
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * <p>
     * Getter for the field <code>enemies</code>.</p>
     *
     * @return the enemies
     */
    public List<Enemy> getEnemies() {
        return enemies;
    }

    /**
     * <p>
     * Getter for the field <code>trebuchet</code>.</p>
     *
     * @return the trebuchet
     */
    public int getTrebuchet() {
        return trebuchet;
    }

    /**
     * <p>
     * Setter for the field <code>trebuchet</code>.</p>
     *
     * @param trebuchet the trebuchet to set
     */
    public void setTrebuchet(int trebuchet) {
        this.trebuchet = trebuchet;
    }

    /**
     * <p>
     * getEnemy.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Enemy}
     * object.
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
     * <p>
     * checkCloseCombat.</p>
     */
    public void checkCloseCombat() {
        int aux, flag = 0;
        Game game = new Game();
        while (flag == 0) {
            aux = 0;
            if (gameData.getPlayer().getActionPoints() == 0) {
                game.finish();
            }
            aux = gameData.getBattleCard().getEnemies().stream().filter((enemy) -> (enemy.getPosition() == 0)).map((_item) -> 1).reduce(aux, Integer::sum);
            if (aux == 3) {
                game.finish();
            } else {
                if (aux == 2) {

                    flag = 1;
                    aux = Dice.roll();
                    if (aux == 1) {
                        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
                        gameData.getPlayer().setActionPoints(gameData.getPlayer().getActionPoints() - 1);
                    } else {
                        if (aux > 4) {
                            gameData.getBattleCard().getEnemies().stream().filter((enemy) -> (enemy.getPosition() == 0)).forEachOrdered((enemy) -> {
                                enemy.move(Constants.MOVE.DOWN);
                            });
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
