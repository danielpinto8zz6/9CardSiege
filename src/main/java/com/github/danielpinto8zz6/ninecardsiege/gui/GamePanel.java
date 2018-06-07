package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Observable;
//import java.io.FileInputStream;

public class GamePanel extends JPanel  {
  private static final long serialVersionUID = 1L;
    static Image bGImage;

  ObservableGame game;
  StartOptionPanel optionPanel;
  OptionPanel optionPane2;
  GameGrid theGrid;
  PlayerData playerData;

  public GamePanel(ObservableGame game) {
    this.game = game;
    setupComponents();
    setupLayout();
  }


  private void setupComponents() {
    optionPanel = new StartOptionPanel(game);
    optionPane2 = new OptionPanel(game);

    theGrid = new GameGrid(game);

    playerData = new PlayerData(game, 1);
  }

  private void setupLayout() {
    JPanel pCenter, pSouth;

    setLayout(new BorderLayout());

    pCenter = new JPanel();
    
    pCenter.setLayout(new BorderLayout());


    pSouth = new JPanel();
    pSouth.add(playerData);
    
        add(pCenter, BorderLayout.CENTER);
    pCenter.add(pSouth, BorderLayout.SOUTH);
    add(optionPanel, BorderLayout.EAST);
    
    add(optionPane2, BorderLayout.EAST);

    pCenter.add(theGrid, BorderLayout.CENTER);
    validate();
  }
  
}
