package com.github.danielpinto8zz6.ninecardsiege.gui;

import static com.github.danielpinto8zz6.ninecardsiege.gui.GamePanel.bGImage;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Grelha de celulas... E' apenas um contentor
 *
 * @author JMSousa (base)
 */
class GameGrid extends JPanel implements Constants {
  private static final long serialVersionUID = 1L;

  ObservableGame game;

  GameGrid(ObservableGame g) {
    game = g;
    loadImages(game);

    setupLayout();
  }

  void setupLayout() {
    setLayout(new BorderLayout());

    JPanel p =
        new JPanel() {
          @Override
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bGImage, 0, 0, getWidth(), getHeight(), null);
          }
        };
    add(p, BorderLayout.CENTER);
  }

  static void loadImages(ObservableGame game) {
    try {
      bGImage = ImageIO.read(Resources.getResourceFile("/b.png"));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
