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

public class TextUI {

    private Game game;

    private Scanner s;

    public TextUI(Game game) {
        this.game = game;
        s = new Scanner(System.in);
    }

    private void showGame() {
        System.out.println(game);
    }

    private void getUserInputWhileAwaitingBeginning() {
        int value;
        String name = null;

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

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("\n\n---------------------------------");
        System.out.println("\n\n1 - Begin");
        System.out.println("2 - Restore Saved Game");
        System.out.println("0 - Exit");
        System.out.print("\n> ");

        while (!s.hasNextInt()) {
            s.next();
        }

        value = s.nextInt();

        switch (value) {
        case 1:
            game.Start();
            break;
        case 2:
            restoreGame();
            break;
        case 0:
            game.Finish();
            break;
        default:
            System.out.println("Invalid option");
            break;
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
            saveGame();
            break;
        case 2:
            restoreGame();
            break;
        case 0:
            game.Finish();
            break;
        default:
            System.out.println("Invalid option");
            break;
        }
    }

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
            break;
        case 0:
            game.Finish();
            break;
        default:
            System.out.println("Invalid option");
            break;
        }
    }

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
     * @return the game
     */
    public Game getGame() {
        return game;
    }

    public void saveGame() {
        String fileName = null;

        System.out.print("File name: ");

        try {
            fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileName == null)
            return;

        if (fileName.length() < 1)
            return;

        try {
            GameSave.saveGameToFile(game, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restoreGame() {
        String fileName = null;
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("File name: ");

        try {
            fileName = bin.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileName == null)
            return;

        if (bin != null)
            return;

        try {
            game = GameSave.retrieveGameFromFile(fileName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
