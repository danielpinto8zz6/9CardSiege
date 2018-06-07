package com.github.danielpinto8zz6.ninecardsiege.gui;

import static com.github.danielpinto8zz6.ninecardsiege.gui.GamePanel.bGImage;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

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

        JPanel p = new JPanel(){
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(bGImage,0,0,getWidth(),getHeight(),null);
    }
    };
        add(p, BorderLayout.CENTER);

  }
      static void loadImages(ObservableGame game){
        //URL url = Resources.getResourceFile("/back/event_card.gif");

                try{
                    //bGImage = ImageIO.read(Resources.getResourceFile("/image/b.png"));
                                        bGImage = ImageIO.read(new FileInputStream("C:\\Users\\tiago_000\\Documents\\NetBeansProjects\\9CardSiege\\src\\main\\java\\com\\github\\danielpinto8zz6\\ninecardsiege\\gui\\images\\b.png"));

                }catch(IOException e){
                                    System.err.println(e.getMessage());

                }
    }
}
