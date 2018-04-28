package com.github.danielpinto8zz6.ninecardsiege.text_ui;

import java.util.Scanner;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.*;

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

        System.out.println("1 - Begin");
        System.out.print("> ");

        while (!s.hasNextInt()) {
            s.next();
        }

        value = s.nextInt();

        if (value == 1) {
            game.Start();
        }
    }

    private void getUserInputWhileAwaitingOptionSelection() {
        int value;

        System.out.println("\n\n---------------------------------");
        showGame();

        System.out.println("0 - Finish Game");
        System.out.print("> ");

        while (!s.hasNextInt())
            s.next();

        value = s.nextInt();

        if (value == 0) {
            game.Finish();
        }
    }

    public void getUserInputWhileAwaitTopCardToBeDrawn() {
        int value;

        showGame();

        System.out.print("> ");

        while (!s.hasNextInt())
            s.next();

        value = s.nextInt();

        if (value == 0) {
            game.Finish();
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
}
