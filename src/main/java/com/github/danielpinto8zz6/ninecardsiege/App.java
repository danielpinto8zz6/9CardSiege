package com.github.danielpinto8zz6.ninecardsiege;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.text_ui.TextUI;

/**
 * <p>App class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class App {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {
        TextUI textUI = new TextUI(new Game());
        textUI.run();
    }
}
