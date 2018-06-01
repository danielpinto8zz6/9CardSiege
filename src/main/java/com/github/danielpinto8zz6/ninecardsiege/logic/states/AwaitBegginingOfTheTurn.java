/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
/**
 *
 * @author tiago_000
 */
public class AwaitBegginingOfTheTurn extends StateAdapter {
      private static final long serialVersionUID = 1L;

    
  public AwaitBegginingOfTheTurn(GameData g) {
    super(g);
  }
  
  
    /** {@inheritDoc} */
  @Override
    public IStates StartOfTheTurn(){
        
        

      getGameData().getPlayer().setSupplies(getGameData().getPlayer().getSupplies() - 1);

            /**
     * Perform enemy line check if our troops are on the enemy lines we have to roll a D6 if we roll
     * a 1 they are captured
     */
    if (getGameData().getStatusCard().getTroopPosition() == 3) {
      getGameData().addMsgLog("Performing enemy line check");

      if (Dice.roll() == 1) {
        getGameData().addMsgLog("Troops have been Captured");
        getGameData().getStatusCard().setTroopPosition(0);
        getGameData().getStatusCard().removeSupplies();
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
      }
    }

    /** Perform the Free Movement */
    if (getGameData().getStatusCard().getTroopPosition() < 3
        && getGameData().getStatusCard().getTroopPosition() > 0) {
      getGameData().addMsgLog("Performing Free Movement");
      if (getGameData().getStatusCard().getDirection() == 0) {
        getGameData()
            .getStatusCard()
            .setTroopPosition(getGameData().getStatusCard().getTroopPosition() + 1);
      } else {
        getGameData()
            .getStatusCard()
            .setTroopPosition(getGameData().getStatusCard().getTroopPosition() - 1);

        if (getGameData().getStatusCard().getTroopPosition() == 0) {
          getGameData()
              .getPlayer()
              .setSupplies(
                  getGameData().getPlayer().getSupplies()
                      + getGameData().getStatusCard().getSupplies());
          getGameData().getStatusCard().removeSupplies();
          if (getGameData().getPlayer().getSupplies() > 4) {
            getGameData().getPlayer().setSupplies(4);
          }
        }
      }
    }
    /** Perform close combat action if 2 enemies in close combat area */
    if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 2) {
      getGameData().addMsgLog("Performing close combat action");
      int roll = Dice.roll();
      boolean keepRolling = true;

      while (keepRolling) {

        if (getGameData().getPlayer().getActionPoints() == 0) {
          getGameData()
              .addMsgLog("Game Over! No more actions points while performing close combat");
          return new GameOver(getGameData());
        }

        if (roll == 1) {
          getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
        } else if (roll > 4) {
          for (Enemy enemy : getGameData().getBattleCard().getEnemiesInCloseCombatArea()) {
            enemy.move(Constants.MOVE.DOWN);
            keepRolling = false;
          }
        }
        getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);
        roll = Dice.roll();
      }

    } else if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 3) {
      /** If there are 3 enemies on close combat area the game is over */
      getGameData().addMsgLog("Game Over! 3 enemies on close combat area");
      return new GameOver(getGameData());
    }
    return new AwaitActionSelection(getGameData());
    }
}
