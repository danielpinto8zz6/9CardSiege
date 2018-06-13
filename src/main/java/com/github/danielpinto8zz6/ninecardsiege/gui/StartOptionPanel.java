package com.github.danielpinto8zz6.ninecardsiege.gui;

// import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;

/**
 * Painel que apresenta as varias opcoes de configuracao e permite iniciar o
 * game Observa o game para se tornar invisivel/visivel conforme um game esteja
 * em curso ou nao.
 *
 * @author JMSousa (base)
 */
class StartOptionPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	ObservableGame game;

	JButton start = new JButton("Start");
	JButton end = new JButton("End");
	JButton attack = new JButton("atack");

	PlayerNameBox playerName;

	StartOptionPanel(ObservableGame g) {
		game = g;

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(game.getState() instanceof AwaitBeginning);
	}

	private void setupComponents() {
		playerName = new PlayerNameBox(game);

		start.addActionListener(ev -> {
			game.setPlayerName(playerName.getText());
			game.start();
		});

		end.addActionListener(ev -> System.exit(0));
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

}
