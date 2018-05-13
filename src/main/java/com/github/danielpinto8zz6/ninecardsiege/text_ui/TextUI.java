package com.github.danielpinto8zz6.ninecardsiege.text_ui;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameSave;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitActionSelection;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitEnemyTrackSelectionForArchersAttack;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitEnemyTrackSelectionForBoilingWaterAttack;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitOptionSelectionForExtraActionPoint;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitOptionSelectionForRallyTroops;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.GameOver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * TextUI class
 *
 * @author daniel
 * @version $Id: $Id
 */
public class TextUI {

  private Game game;

  private final Scanner s;

  /**
   * Constructor for TextUI.
   *
   * @param game a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Game} object.
   */
  public TextUI(Game game) {
    this.game = game;
    s = new Scanner(System.in, "UTF-8");
  }

  private void showGame() {
    System.out.println(game);
  }

  private void getUserInputWhileAwaitingBeginning() {
    int value;
    String name;

    System.out.println("\n\n---------------------------------");
    System.out.println("\n\n1 - Begin");
    System.out.println("2 - Set Player Name");
    System.out.println("3 - Restore Saved Game");
    System.out.println("0 - Exit");
    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.next();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        game.start();
        return;
      case 2:
        System.out.println("\n\n---------------------------------");
        System.out.println("Type your Player name");
        System.out.print("\n> ");

        while (!s.hasNext()) {
          s.next();
        }

        name = s.next();

        getGame().getGameData().getPlayer().setName(name);

        return;
      case 3:
        try {
          handleRestoreGameFromFileOption();
        } catch (ClassNotFoundException | IOException e) {
          System.out.println(e.getMessage());
        }
        return;
      case 0:
        game.finish();
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  private void getUserInputWhileAwaitingOptionSelection() {
    int value;

    System.out.println("\n\n---------------------------------");
    showGame();
    System.out.println();
    System.out.println("1 - Archers Attack");
    System.out.println("2 - Boiling Water Attack");
    System.out.println("3 - Close Combat Attack");
    System.out.println("4 - Coupure");
    System.out.println("5 - Rally troops");
    System.out.println("6 - Tunel Movement");
    System.out.println("7 - Supply Raid");
    System.out.println("8 - Sabotage");
    System.out.println("9 - Extra Action Point");
    System.out.println("10 - Next turn");
    System.out.println("11 - Save Game");
    System.out.println("12 - Restore Game");
    System.out.println("0 - Finish Game");
    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.next();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        game.archersAttack();
        return;
      case 2:
        game.boilingWaterAttack();
        return;
      case 3:
        game.closeCombatAttack();
        return;
      case 4:
        game.coupure();
        return;
      case 5:
        game.rallyTroops();
        return;
      case 6:
        game.tunnelMovement();
        return;
      case 7:
        game.supplyRaid();
        return;
      case 8:
        game.sabotage();
        return;
      case 9:
        game.extraActionPoint();
        return;
      case 10:
        game.endOfTurn();
        return;
      case 11:
        try {
          handleSaveGameToFileOption();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
        return;
      case 12:
        try {
          handleRestoreGameFromFileOption();
        } catch (ClassNotFoundException | IOException e) {
          System.out.println(e.getMessage());
        }
        return;
      case 0:
        game.finish();
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  /** getUserInputWhileAwaitTopCardToBeDrawn. */
  private void getUserInputWhileAwaitTopCardToBeDrawn() {
    int value;

    System.out.println("\n\n---------------------------------");
    // showGame();
    System.out.println();
    System.out.println("1 - Draw top card");
    System.out.println("0 - Finish Game");
    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.next();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        game.drawTopCard();
        return;
      case 0:
        game.finish();
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  private void getUserInputWhileAwaitEnemyTrackSelection() {
    String name;

    System.out.println("\n\n---------------------------------");
    System.out.println();
    System.out.println("Enter name of enemy to attack (0 to end game): ");

    System.out.print("\n> ");

    while (!s.hasNext()) {
      s.next();
    }

    name = s.next();

    if (name.equals("0")) game.finish();

    game.attack(name);
  }

  private void getUserInputWhileAwaitOptionSelectionForExtraActionPoint() {
    int value;

    System.out.println("\n\n---------------------------------");
    System.out.println();
    System.out.println("Do you want to trade moral or supplies : ");
    System.out.println();
    System.out.println("1 - Moral");
    System.out.println("2 - Supplies");
    System.out.println("0 - End Game");
    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.nextInt();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        getGame().applyExtraActionPoint(Constants.EXTRA.MORAL);
        return;
      case 2:
        getGame().applyExtraActionPoint(Constants.EXTRA.SUPPLIES);
        return;
      case 0:
        getGame().finish();
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  private void getUserInputWhileAwaitOptionSelectionForRallyTroops() {
    int value;

    System.out.println("\n\n---------------------------------");
    System.out.println();
    System.out.println("Do you want to add more 1 to the roll : ");
    System.out.println();
    System.out.println("1 - Yes");
    System.out.println("2 - No");
    System.out.println("0 - End Game");

    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.nextInt();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        getGame().applyRallyTroops(true);
        return;
      case 2:
        getGame().applyRallyTroops(false);
        return;
      case 0:
        getGame().finish();
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  private void getUserInputWhileGameOver() {
    int value;

    System.out.println("\n\n---------------------------------");
    System.out.println();
    System.out.println("Do you wanna play again : ");
    System.out.println();
    System.out.println("1 - Yes");
    System.out.println("2 - No");

    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.nextInt();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        getGame().playAgain();
        return;
      case 2:
        Runtime.getRuntime().exit(0);
        return;
      default:
        System.out.println("Invalid option");
    }
  }

  /** run. */
  public void run() {
    while (!(game.getState() instanceof GameOver)) {

      if (game.getMsgLog().size() > 0) {
        System.out.println();

        game.getMsgLog().forEach((msg) -> System.out.println("---> " + msg));
        game.clearMsgLog();
      }
      game.checkStatus();

      if (game.getState() instanceof AwaitBeginning) {
        getUserInputWhileAwaitingBeginning();
      } else if (game.getState() instanceof AwaitTopCardToBeDrawn) {
        getUserInputWhileAwaitTopCardToBeDrawn();
      } else if (game.getState() instanceof AwaitActionSelection) {
        getUserInputWhileAwaitingOptionSelection();
      } else if (game.getState() instanceof AwaitEnemyTrackSelectionForArchersAttack) {
        getUserInputWhileAwaitEnemyTrackSelection();
      } else if (game.getState() instanceof AwaitEnemyTrackSelectionForBoilingWaterAttack) {
        getUserInputWhileAwaitEnemyTrackSelection();
      } else if (game.getState() instanceof AwaitOptionSelectionForExtraActionPoint) {
        getUserInputWhileAwaitOptionSelectionForExtraActionPoint();
      } else if (game.getState() instanceof AwaitOptionSelectionForRallyTroops) {
        getUserInputWhileAwaitOptionSelectionForRallyTroops();
      } else if (game.getState() instanceof GameOver) {
        getUserInputWhileGameOver();
      }
    }

    System.out.println();
    System.out.println("************** Game over *****************");

    showGame();

    game.getMsgLog().forEach((msg) -> System.out.println("---> " + msg));
  }

  /**
   * Getter for the field <code>game</code>.
   *
   * @return the game
   */
  public Game getGame() {
    return game;
  }

  /**
   * handleRestoreGameFromFileOption.
   *
   * @throws java.lang.ClassNotFoundException if any.
   * @throws java.io.IOException if any.
   */
  public void handleRestoreGameFromFileOption() throws ClassNotFoundException, IOException {
    String fileName;
    BufferedReader bin = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

    System.out.print("File name: ");

    fileName = bin.readLine();

    game = (Game) GameSave.retrieveGameFromFile(fileName);
  }

  private void handleSaveGameToFileOption() throws IOException {
    String fileName;

    System.out.print("File name: ");
    fileName = new BufferedReader(new InputStreamReader(System.in, "UTF-8")).readLine();

    if (fileName == null) {
      return;
    }

    if (fileName.length() < 1) {
      return;
    }

    GameSave.saveGameToFile(game, fileName);
  }
}
