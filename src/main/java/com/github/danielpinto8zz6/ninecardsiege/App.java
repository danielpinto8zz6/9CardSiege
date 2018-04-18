package com.github.danielpinto8zz6.ninecardsiege;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.text_ui.TextUI;

public class App {

    public static void main(String[] args) {
        TextUI textUI = new TextUI(new Game());
        textUI.run();
    }
}
