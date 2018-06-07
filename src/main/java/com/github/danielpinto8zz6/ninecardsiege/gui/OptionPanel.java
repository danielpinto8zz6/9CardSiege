/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/** @author tiago_000 */
public class OptionPanel extends JPanel implements Observer {
  private static final long serialVersionUID = 1L;

  ObservableGame game;
  JButton end = new JButton("End");

  OptionPanel(ObservableGame g) {

    game = g;
    game.addObserver(this);

    setBackground(Color.BLACK);
    setupComponents();
    setupLayout();

    setVisible(false);
  }

  private void setupComponents() {

    end.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ev) {
            System.exit(0);
          }
        });
  }

  private void setupLayout() {

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    end.setAlignmentX(Component.CENTER_ALIGNMENT);
    end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    add(Box.createVerticalStrut(10));
    add(end);

    validate();
  }

  @Override
  public void update(Observable o, Object arg) {

    setVisible(game.getState() instanceof AwaitTopCardToBeDrawn);
  }
}
