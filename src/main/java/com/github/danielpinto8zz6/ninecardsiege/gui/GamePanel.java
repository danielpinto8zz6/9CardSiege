package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 1L;

  ObservableGame game;
  StartOptionPanel optionPanel;
  GameGrid theGrid;
  PlayerData playerData;

  public GamePanel(ObservableGame game) {
    this.game = game;

    setupComponents();
    setupLayout();
  }

  private void setupComponents() {
    optionPanel = new StartOptionPanel(game);
    theGrid = new GameGrid(game);
    playerData = new PlayerData(game, 1);
  }

  private void setupLayout() {
    JPanel pCenter, pSouth;

    setLayout(new BorderLayout());

    pCenter = new JPanel();
    pCenter.setLayout(new BorderLayout());
    pCenter.add(theGrid, BorderLayout.NORTH);

    pSouth = new JPanel();
    pSouth.add(playerData);
    pCenter.add(pSouth, BorderLayout.SOUTH);

    add(pCenter, BorderLayout.CENTER);

    add(optionPanel, BorderLayout.EAST);

    validate();
  }
}
