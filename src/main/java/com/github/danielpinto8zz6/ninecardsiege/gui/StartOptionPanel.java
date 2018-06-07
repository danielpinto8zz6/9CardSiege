package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import java.awt.BorderLayout;

/**
 * Painel que apresenta as varias opcoes de configuracao e permite iniciar o game Observa o game
 * para se tornar invisivel/visivel conforme um game esteja em curso ou nao.
 *
 * @author JMSousa (base)
 */
class StartOptionPanel extends JPanel implements Observer {
  private static final long serialVersionUID = 1L;

  ObservableGame game;

  JButton start = new JButton("Start");
    JButton end = new JButton("End");
    JButton attack = new JButton("atack");

  PlayerNameBox playerName;

  StartOptionPanel(ObservableGame g) {
    game = g;
    game.addObserver(this);

    setBackground(Color.GRAY);
    setupComponents();
    setupLayout();

    setVisible(game.getState() instanceof AwaitBeginning);
  }

  private void setupLayout() {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    start.setAlignmentX(Component.CENTER_ALIGNMENT);

    add(Box.createVerticalStrut(20));
    add(start);

    playerName.setMinimumSize(new Dimension(120, 20));

    playerName.setAlignmentX(Component.CENTER_ALIGNMENT);
    playerName.setOpaque(false);

    add(Box.createVerticalStrut(10));
    add(playerName);
    
    end.setAlignmentX(Component.CENTER_ALIGNMENT);
        end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    add(Box.createVerticalStrut(10));
    add(end);

    validate();
  }
  
    private void reSetupLayout() {
            setBackground(Color.BLUE);

setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    attack.setAlignmentX(Component.CENTER_ALIGNMENT);

    add(Box.createVerticalStrut(20));
    add(attack);
    
    validate();
  }

  private void setupComponents() {
    playerName = new PlayerNameBox(game);

    start.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ev) {
            game.setPlayerName(playerName.getText());
            game.start();

          }
        });
    
        end.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ev) {
            game.finish();
            System.exit(0);

          }
        });
  }

  @Override
  public void update(Observable o, Object arg) {
        setVisible(game.getState() instanceof AwaitBeginning);
  }
}
