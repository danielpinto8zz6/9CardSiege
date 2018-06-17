package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.GameOver;

/**
 * Painel que apresenta os dados do jogador: indica o nome, conteudo da mao,
 * player activo e apresenta mensagem de vitoria se adequado.
 *
 * @author JMSousa (base)
 */
class PlayerData extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;
	JLabel victoryMessage;
	JLabel name;
	JLabel actionPoints;
	JLabel day;

	ObservableGame game;
	int playerNumber;

	PlayerData(ObservableGame game, int playerNumber) {
		this.game = game;
		this.game.addObserver(this);
		this.playerNumber = playerNumber;

		victoryMessage = new JLabel("Loooser!!");

		name = new JLabel();
		actionPoints = new JLabel();
		day = new JLabel();

		setupLayout();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// final Graphics2D g2 = (Graphics2D) g;
		// g2.setStroke(new BasicStroke(8)); // espessura da linha
		// g2.setColor(Color.GREEN);
		// g2.drawRect(0, 0, getWidth(), getHeight());
	}

	private void setupLayout() {
		final Player player = game.getPlayer();

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		setPreferredSize(new Dimension(200, 80));

		name.setText(player.getName());
		name.setAlignmentX(Component.CENTER_ALIGNMENT);
		name.setAlignmentY(Component.CENTER_ALIGNMENT);

		day.setText("Day :" + String.valueOf(game.getGameData().getDay()));
		day.setBounds(0, 0, 200, 50);
		day.setVisible(false);

		actionPoints.setText("Action Points :" + String.valueOf(game.getGameData().getPlayer().getActionPoints()));
		actionPoints.setBounds(0, 20, 200, 50);
		actionPoints.setVisible(false);

		victoryMessage.setVisible(false);
		victoryMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
		victoryMessage.setFont(new Font("Dialog", Font.BOLD, 30));

		add(name);
		add(day);
		add(actionPoints);
		add(victoryMessage);

		validate();

	}

	@Override
	public void update(Observable arg0, Object arg1) {

		final Player player = game.getPlayer();

		name.setText(player.getName());
		day.setText("Day :" + String.valueOf(game.getGameData().getDay()));
		actionPoints.setText("Action Points :" + String.valueOf(game.getGameData().getPlayer().getActionPoints()));

		if (!(game.getState() instanceof AwaitBeginning)) {
			day.setVisible(true);
			actionPoints.setVisible(true);
		}
		if (game == null) {
			return;
		}

		if (game.getState() instanceof GameOver) {
			day.setVisible(false);
			actionPoints.setVisible(false);
			victoryMessage.setVisible(true);
		} else {
			/**
			 * Hack
			 */
			victoryMessage.setVisible(false);
		}
	}
}
