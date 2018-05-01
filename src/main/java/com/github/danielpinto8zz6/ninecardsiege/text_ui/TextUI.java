package com.github.danielpinto8zz6.ninecardsiege.text_ui;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameSave;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitActionSelection;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.GameOver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * TextUI class.
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
    System.out.println("1 - Save Game");
    System.out.println("2 - Restore Game");
    System.out.println("0 - Finish Game");
    System.out.print("\n> ");

    while (!s.hasNextInt()) {
      s.next();
    }

    value = s.nextInt();

    switch (value) {
      case 1:
        try {
          handleSaveGameToFileOption();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
        return;
      case 2:
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
    showGame();
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

  /**
   * run.
   */
  public void run() {
    while (!(game.getState() instanceof GameOver)) {

      if (game.getMsgLog().size() > 0) {
        System.out.println();

        game.getMsgLog().forEach((msg) -> System.out.println("---> " + msg));
        game.clearMsgLog();
      }

      if (game.getState() instanceof AwaitBeginning) {
        getUserInputWhileAwaitingBeginning();
      } else if (game.getState() instanceof AwaitTopCardToBeDrawn) {
        getUserInputWhileAwaitTopCardToBeDrawn();
      } else if (game.getState() instanceof AwaitActionSelection) {
        getUserInputWhileAwaitingOptionSelection();
      }
    }

    System.out.println();
    System.out.println("************** Game over *****************");

    showGame();
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
