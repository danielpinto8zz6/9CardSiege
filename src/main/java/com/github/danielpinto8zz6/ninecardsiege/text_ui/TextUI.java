package com.github.danielpinto8zz6.ninecardsiege.text_ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameSave;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitActionSelection;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.GameOver;

/**
 * <p>
 * TextUI class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class TextUI {

    private Game game;

    private final Scanner s;

    /**
     * <p>
     * Constructor for TextUI.</p>
     *
     * @param game a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Game}
     * object.
     */
    public TextUI(Game game) {
        this.game = game;
        s = new Scanner(System.in);
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
                game.Start();
                return;
            case 2:
                System.out.println("\n\n---------------------------------");
                System.out.println("Type your Player name");
                System.out.print("\n> ");

                while (!s.hasNext()) {
                    s.next();
                }

                name = s.next();

                if (name != null) {
                    getGame().getGameData().getPlayer().setName(name);
                }
                return;
            case 3:
                try {
                    handleRestoreGameFromFileOption();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            case 0:
                game.Finish();
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
                    e.printStackTrace();
                }
                return;
            case 2:
                try {
                    handleRestoreGameFromFileOption();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            case 0:
                game.Finish();
                return;
            default:
                System.out.println("Invalid option");
        }
    }

    /**
     * <p>
     * getUserInputWhileAwaitTopCardToBeDrawn.</p>
     */
    public void getUserInputWhileAwaitTopCardToBeDrawn() {
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
                game.DrawTopCard();
                return;
            case 0:
                game.Finish();
                return;
            default:
                System.out.println("Invalid option");
        }
    }

    /**
     * <p>
     * run.</p>
     */
    public void run() {
        while (!(game.getState() instanceof GameOver)) {

            if (game.getMsgLog().size() > 0) {
                System.out.println();

                for (String msg : game.getMsgLog()) {
                    System.out.println("---> " + msg);
                }
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
     * <p>
     * Getter for the field <code>game</code>.</p>
     *
     * @return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * <p>
     * handleRestoreGameFromFileOption.</p>
     *
     * @throws java.lang.ClassNotFoundException if any.
     * @throws java.io.IOException if any.
     */
    public void handleRestoreGameFromFileOption() throws ClassNotFoundException, IOException {
        String fileName;
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("File name: ");

        fileName = bin.readLine().trim();

        if (fileName == null) {
            return;
        }

        game = (Game) GameSave.retrieveGameFromFile(fileName);
    }

    private void handleSaveGameToFileOption() throws IOException {
        String fileName;

        System.out.print("File name: ");
        fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        if (fileName == null) {
            return;
        }

        if (fileName.length() < 1) {
            return;
        }

        GameSave.saveGameToFile(game, fileName);
    }
}
