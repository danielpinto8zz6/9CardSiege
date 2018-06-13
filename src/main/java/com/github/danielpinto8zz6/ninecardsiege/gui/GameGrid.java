package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;

/**
 * Grelha de celulas... E' apenas um contentor
 *
 * @author JMSousa (base)
 */
class GameGrid extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;

	static void loadImages(ObservableGame game) {

		int i = 0;
		for (final String fileName : GamePanel.imageFiles) {
			try {
				GamePanel.gameImgs[i++] = ImageIO.read(Resources.getResourceFile(fileName));
			} catch (final IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	ObservableGame game;
	JPanel battleC;
	JPanel statusC;
	JPanel backCard;
	JPanel backGround;

	JPanel frontCard;

	GameGrid(ObservableGame g) {
		game = g;
		game.addObserver(this);
		GameGrid.loadImages(game);

		setupLayout();
	}

	private void setupLayout() {
		setLayout(new BorderLayout());

		backGround = new JPanel() {

			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(GamePanel.gameImgs[7], 0, 0, getWidth(), getHeight(), null);
			}
		};

		backGround.setLayout(new GridLayout(0, 3));
		battleC = new JPanel() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(GamePanel.gameImgs[8], 0, 0, getWidth(), getHeight(), null);
				g.setColor(Color.RED);
				final int x = 20;
				final int y = 127;
				g.fillOval(x, y, 40, 40);
			}
		};
		statusC = new JPanel() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(GamePanel.gameImgs[9], 0, 0, getWidth(), getHeight(), null);
				g.setColor(Color.GREEN);
				final int x = 18;
				final int y = 13;
				g.fillOval(x, y, 40, 40);
			}
		};
		backCard = new JPanel() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(GamePanel.gameImgs[10], 0, 0, getWidth(), getHeight(), null);
			}
		};
		frontCard = new JPanel() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int i = game.getGameData().getNumCard();
				i--;
				g.drawImage(GamePanel.gameImgs[i], 0, 0, getWidth(), getHeight(), null);
			}
		};

		/*
		 * battleC.setVisible(false); statusC.setVisible(false);
		 * frontCard.setVisible(false);
		 */

		add(backGround, BorderLayout.CENTER);
		battleC.setVisible(false);
		statusC.setVisible(false);
		frontCard.setVisible(false);

		backGround.add(battleC);
		backGround.add(statusC);
		backGround.add(frontCard);

		validate();

	}

	@Override
	public void update(Observable o, Object arg) {

		if (!(game.getState() instanceof AwaitBeginning)) {
			battleC.setVisible(true);
			statusC.setVisible(true);
			frontCard.setVisible(true);
		}
	}

}