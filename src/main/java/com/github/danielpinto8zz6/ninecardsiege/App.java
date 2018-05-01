package com.github.danielpinto8zz6.ninecardsiege;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.text_ui.TextUI;

/**
 * App class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class App {

    /**
     * main.
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {
        TextUI textUI = new TextUI(new Game());
        textUI.run();
    }
}
