package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
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

				final Image image = GamePanel.gameImgs[7];

				final double scaleFactor = Math.min(1d, Utils
						.getScaleFactorToFit(new Dimension(image.getWidth(null), image.getHeight(null)), getSize()));

				final int scaleWidth = (int) Math.round(image.getWidth(null) * scaleFactor);
				final int scaleHeight = (int) Math.round(image.getHeight(null) * scaleFactor);

				final int width = getWidth() - 1;
				final int height = getHeight() - 1;

				final int x = (width - scaleWidth) / 2;
				final int y = (height - scaleHeight) / 2;

				g.drawImage(image, x, y, scaleWidth, scaleHeight, this);
			}
		};

		backGround.setLayout(new GridLayout(0, 3));
		backGround.setBackground(Color.BLACK);

		battleC = new JPanel() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				final Image image = GamePanel.gameImgs[8];
				final double scaleFactor = Math.min(1d, Utils
						.getScaleFactorToFit(new Dimension(image.getWidth(null), image.getHeight(null)), getSize()));

				final int scaleWidth = (int) Math.round(image.getWidth(null) * scaleFactor);
				final int scaleHeight = (int) Math.round(image.getHeight(null) * scaleFactor);

				final int width = getWidth() - 1;
				final int height = getHeight() - 1;

				final int x = (width - scaleWidth) / 2;
				final int y = (height - scaleHeight) / 2;

				g.drawImage(image, x, y, scaleWidth, scaleHeight, this);

				/**
				 * Place enemies
				 */
				Point cardCoord;
				final int pieceScaled = Utils.getPieceScaledSize(scaleHeight, Constants.PIECE_SCALE);

				g.setColor(Color.RED);

				for (final Enemy enemy : game.getGame().getEnemies()) {
					switch (enemy.getPosition()) {
					case 0:
						if (enemy.getName() == "Ladders") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_0_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "BattleRam") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_0_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "SiegeTower") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_0_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						}
						break;
					case 1:
						if (enemy.getName() == "Ladders") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_1_SCALE, Constants.BATTLECARD_LINE_1_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "BattleRam") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_1_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "SiegeTower") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_3_SCALE, Constants.BATTLECARD_LINE_1_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						}
						break;
					case 2:
						if (enemy.getName() == "Ladders") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_1_SCALE, Constants.BATTLECARD_LINE_2_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "BattleRam") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_2_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "SiegeTower") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_3_SCALE, Constants.BATTLECARD_LINE_2_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						}
						break;
					case 3:
						if (enemy.getName() == "Ladders") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_1_SCALE, Constants.BATTLECARD_LINE_3_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "BattleRam") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_3_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "SiegeTower") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_3_SCALE, Constants.BATTLECARD_LINE_3_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						}
						break;
					case 4:
						if (enemy.getName() == "Ladders") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_1_SCALE, Constants.BATTLECARD_LINE_4_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "BattleRam") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_4_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						} else if (enemy.getName() == "SiegeTower") {
							cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
									Constants.BATTLECARD_COLUMN_3_SCALE, Constants.BATTLECARD_LINE_4_SCALE, x, y);
							g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
						}
						break;
					}
				}

				/**
				 * Trebuchet
				 */
				g.setColor(Color.BLUE);

				switch (game.getGame().getGameData().getBattleCard().getTrebuchet()) {
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.BATTLECARD_COLUMN_1_SCALE, Constants.BATTLECARD_LINE_5_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.BATTLECARD_COLUMN_2_SCALE, Constants.BATTLECARD_LINE_5_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 3:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.BATTLECARD_COLUMN_3_SCALE, Constants.BATTLECARD_LINE_5_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}
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

				final Image image = GamePanel.gameImgs[9];
				final double scaleFactor = Math.min(1d, Utils
						.getScaleFactorToFit(new Dimension(image.getWidth(null), image.getHeight(null)), getSize()));

				final int scaleWidth = (int) Math.round(image.getWidth(null) * scaleFactor);
				final int scaleHeight = (int) Math.round(image.getHeight(null) * scaleFactor);

				final int width = getWidth() - 1;
				final int height = getHeight() - 1;

				final int x = (width - scaleWidth) / 2;
				final int y = (height - scaleHeight) / 2;

				g.drawImage(image, x, y, scaleWidth, scaleHeight, this);

				Point cardCoord;

				final int pieceScaled = Utils.getPieceScaledSize(scaleHeight, Constants.PIECE_SCALE);

				/**
				 * Trebuchet
				 */
				g.setColor(Color.GREEN);

				switch (game.getGame().getGameData().getPlayer().getWallStrength()) {
				case 0:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_0_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_1_SCALE, Constants.STATUSCARD_LINE_1_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_1_SCALE, Constants.STATUSCARD_LINE_2_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 3:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_1_SCALE, Constants.STATUSCARD_LINE_3_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 4:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_1_SCALE, Constants.STATUSCARD_LINE_4_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}

				/**
				 * Morale
				 */
				switch (game.getGame().getGameData().getPlayer().getMoral()) {
				case 0:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_0_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_1_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_2_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 3:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_3_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 4:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_4_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}

				/**
				 * Morale
				 */
				switch (game.getGame().getGameData().getPlayer().getSupplies()) {
				case 0:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_2_SCALE, Constants.STATUSCARD_LINE_0_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_3_SCALE, Constants.STATUSCARD_LINE_1_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_3_SCALE, Constants.STATUSCARD_LINE_2_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 3:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_3_SCALE, Constants.STATUSCARD_LINE_3_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 4:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_COLUMN_3_SCALE, Constants.STATUSCARD_LINE_4_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}

				/**
				 * Troop position
				 */
				g.setColor(Color.BLACK);

				switch (game.getGame().getGameData().getStatusCard().getTroopPosition()) {
				case 0:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_TROOPS_COLUMN_0_SCALE, Constants.STATUSCARD_TROOPS_LINE_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_TROOPS_COLUMN_1_SCALE, Constants.STATUSCARD_TROOPS_LINE_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_TROOPS_COLUMN_2_SCALE, Constants.STATUSCARD_TROOPS_LINE_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}

				/**
				 * Raid supplies
				 */
				g.setColor(Color.YELLOW);

				switch (game.getGame().getGameData().getPlayer().getmRaidSupplies()) {
				case 1:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_RAIDSUPPLIES_COLUMN_SCALE,
							Constants.STATUSCARD_RAIDSUPPLIES_LINE_1_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				case 2:
					cardCoord = Utils.getCardCoordinatesTodraw(scaleWidth, scaleHeight,
							Constants.STATUSCARD_RAIDSUPPLIES_COLUMN_SCALE,
							Constants.STATUSCARD_RAIDSUPPLIES_LINE_2_SCALE, x, y);
					g.fillOval(cardCoord.x, cardCoord.y, pieceScaled, pieceScaled);
					break;
				}
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

				final Image image = GamePanel.gameImgs[10];
				final double scaleFactor = Math.min(1d, Utils
						.getScaleFactorToFit(new Dimension(image.getWidth(null), image.getHeight(null)), getSize()));

				final int scaleWidth = (int) Math.round(image.getWidth(null) * scaleFactor);
				final int scaleHeight = (int) Math.round(image.getHeight(null) * scaleFactor);

				final int width = getWidth() - 1;
				final int height = getHeight() - 1;

				final int x = (width - scaleWidth) / 2;
				final int y = (height - scaleHeight) / 2;

				g.drawImage(image, x, y, scaleWidth, scaleHeight, this);
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

				final Image image = GamePanel.gameImgs[i];
				final double scaleFactor = Math.min(1d, Utils
						.getScaleFactorToFit(new Dimension(image.getWidth(null), image.getHeight(null)), getSize()));

				final int scaleWidth = (int) Math.round(image.getWidth(null) * scaleFactor);
				final int scaleHeight = (int) Math.round(image.getHeight(null) * scaleFactor);

				final int width = getWidth() - 1;
				final int height = getHeight() - 1;

				final int x = (width - scaleWidth) / 2;
				final int y = (height - scaleHeight) / 2;

				g.drawImage(image, x, y, scaleWidth, scaleHeight, this);
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

		battleC.setBackground(Color.BLACK);
		statusC.setBackground(Color.BLACK);
		frontCard.setBackground(Color.BLACK);

		backGround.add(battleC);
		backGround.add(statusC);
		backGround.add(frontCard);

		validate();

	}

	/** {@inheritDoc} */
	@Override
	public void update(Observable o, Object arg) {

		if (!(game.getState() instanceof AwaitBeginning)) {
			battleC.setVisible(true);
			statusC.setVisible(true);
			frontCard.setVisible(true);
		}
	}

}
