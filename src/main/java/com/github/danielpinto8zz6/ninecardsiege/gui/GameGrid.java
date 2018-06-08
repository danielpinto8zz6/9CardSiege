package com.github.danielpinto8zz6.ninecardsiege.gui;

import static com.github.danielpinto8zz6.ninecardsiege.gui.GamePanel.bGImage;
import static com.github.danielpinto8zz6.ninecardsiege.gui.GamePanel.gameImgs;
import static com.github.danielpinto8zz6.ninecardsiege.gui.GamePanel.imageFiles;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBegginingOfTheTurn;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Grelha de celulas... E' apenas um contentor
 *
 * @author JMSousa (base)
 */
class GameGrid extends JPanel implements Constants,Observer  {
  private static final long serialVersionUID = 1L;

  ObservableGame game;
      JPanel battleC ;
      JPanel statusC ;
      JPanel backCard;
      JPanel frontCard;
  GameGrid(ObservableGame g) {
    game = g;
    loadImages(game);

    setupLayout();
  }

  void setupLayout() {
    setLayout(new BorderLayout());

    JPanel backGround =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(gameImgs[0], 0, 0, getWidth(), getHeight(), null);
          }
        };


            backGround.setLayout(new GridLayout(0,3));
            
        battleC =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(gameImgs[9], 0, 0, getWidth(), getHeight(), null);
          }
        };
        statusC =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(gameImgs[10], 0, 0, getWidth(), getHeight(), null);
          }
        };
        backCard =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(gameImgs[8], 0, 0, getWidth(), getHeight(), null);
          }
        };
        frontCard =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int i = game.getGameData().getNumCard();
            g.drawImage(gameImgs[i], 0, 0, getWidth(), getHeight(), null);
          }
        };
                    
   /* battleC.setVisible(false);
    statusC.setVisible(false);
    frontCard.setVisible(false);*/
              
    add(backGround, BorderLayout.CENTER);
    backGround.add(battleC);
    backGround.add(statusC);
    backGround.add(frontCard);

  }

  static void loadImages(ObservableGame game) {
      
            int i=0;
            for(String fileName:imageFiles){
                try{
                    gameImgs[i++]=ImageIO.read(Resources.getResourceFile(fileName));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
            }          
    }
  
        @Override
    public void update(Observable o, Object arg) {
        
      
    if (game.getState() instanceof AwaitTopCardToBeDrawn){
                    System.exit(0);
    battleC.setVisible(false);
    statusC.setVisible(false);
    frontCard.setVisible(false);
        }
    }

    public JPanel getBattleC() {
        return battleC;
    }

    public void setBattleC(JPanel battleC) {
        this.battleC = battleC;
    }

    public JPanel getStatusC() {
        return statusC;
    }

    public void setStatusC(JPanel statusC) {
        this.statusC = statusC;
    }

    public JPanel getBackCard() {
        return backCard;
    }

    public void setBackCard(JPanel backCard) {
        this.backCard = backCard;
    }

    public JPanel getFrontCard() {
        return frontCard;
    }

    public void setFrontCard(JPanel frontCard) {
        this.frontCard = frontCard;
    }
    
  }