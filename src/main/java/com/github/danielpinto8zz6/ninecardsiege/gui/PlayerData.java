package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Painel que apresenta os dados do jogador: indica o nome, conteudo da mao, player activo e
 * apresenta mensagem de vitoria se adequado.
 *
 * @author JMSousa (base)
 */
class PlayerData extends JPanel implements Observer {
  private static final long serialVersionUID = 1L;
  JLabel victoryMessage;
  JLabel name;

  ObservableGame game;
  int playerNumber;

  PlayerData(ObservableGame game, int playerNumber) {
    this.game = game;
    this.game.addObserver(this);
    this.playerNumber = playerNumber;

    victoryMessage = new JLabel("WINNER !!");

    name = new JLabel();

    setupLayout();
  }

  private void setupLayout() {
    Player player = game.getPlayer();

    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

    setPreferredSize(new Dimension(200, 80));

    name.setText(player.getName());
    name.setAlignmentX(CENTER_ALIGNMENT);
    name.setAlignmentY(CENTER_ALIGNMENT);

    victoryMessage.setVisible(false);
    victoryMessage.setAlignmentX(CENTER_ALIGNMENT);
    victoryMessage.setFont(new Font("Dialog", Font.BOLD, 30));

    add(name);
    add(victoryMessage);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(8)); // espessura da linha
    g2.setColor(Color.GREEN);
    g2.drawRect(0, 0, getWidth(), getHeight());
  }

  @Override
  public void update(Observable arg0, Object arg1) {

    Player player = game.getPlayer();

    name.setText(player.getName());

    if (game == null) {
      return;
    }

    if (game.isOver()) {
      // TODO
    }
  }
}
