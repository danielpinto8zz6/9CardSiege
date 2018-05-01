package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import java.util.List;
import java.util.Scanner;

/**
 * AwaitEnemyTrackSelectionForArchersAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForArchersAttack extends StateAdapter {

    private static final long serialVersionUID = 1L;
    private final Scanner s;

    /**
     * Constructor for AwaitEnemyTrackSelectionForArchersAttack.
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public AwaitEnemyTrackSelectionForArchersAttack(GameData g) {
        super(g);
        s = new Scanner(System.in, "UTF-8");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates attack() {
        int value;
        int roll;
        boolean valid = true;
        //List<Enemy> en = getGameData().getBattleCard().getEnemies();

        while (valid) {
            roll = Dice.roll();
            getGameData().addMsgLog("Perfotming ArchersAttack witch enemy do you want to atack?\n"
                    + "1-Ladders 2-Battle Ram 3-Siege Tower\n");

            while (!s.hasNextInt()) {
                s.next();
            }

            value = s.nextInt();

            switch (value) {
                case 1:
                    Enemy enemyL = getGameData().getEnemy("Ladders");
                    if (enemyL.getStrength() < roll) {
                        enemyL.move(Constants.MOVE.DOWN);
                    }
                    valid = false;
                    break;
                case 2:
                    Enemy enemyR = getGameData().getEnemy("BattleRam");
                    if (enemyR.getStrength() < roll) {
                        enemyR.move(Constants.MOVE.DOWN);
                    }
                    valid = false;
                    break;
                case 3:
                    Enemy enemyT = getGameData().getEnemy("SiegeTower");
                    if (enemyT.getStrength() < roll) {
                        enemyT.move(Constants.MOVE.DOWN);
                    }
                    valid = false;
                    break;
                case 0:
                    return new GameOver(getGameData());
                default:
                    System.out.println("Invalid option");
            }
        }

        return new AwaitActionSelection(getGameData());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates finish() {
        return new GameOver(getGameData());
    }
}
