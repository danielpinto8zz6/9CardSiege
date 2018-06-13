package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitActionSelection;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitEnemyTrackSelectionForArchersAttack;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitTopCardToBeDrawn;

// import java.io.FileInputStream;

public class GamePanel extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;

	static Image bGImage;
	static final String imageFiles[] = { "/back_2.jpg","/card1.jpg", "/card2.jpg", "/card3.jpg", "/card4.jpg",
			"/card5.jpg", "/card6.jpg", "/card7.jpg", "/back_1.jpg", "/batlle.jpg", "/status.jpg" };
	static Image gameImgs[] = new Image[GamePanel.imageFiles.length];
	ObservableGame game;
	StartOptionPanel optionPanel;
	OptionPanel optionPane2;
        ArchersAttackPanel optionPane3;
	GameGrid theGrid;
	PlayerData playerData;
	private CardLayout cardManager;
	private JPanel pEast;

	public GamePanel(ObservableGame game) {
		this.game = game;
		game.addObserver(this);

		setupComponents();
		setupLayout();
	}

	private void setupComponents() {
		optionPanel = new StartOptionPanel(game);
		optionPane2 = new OptionPanel(game);
                optionPane3 = new ArchersAttackPanel(game);
		theGrid = new GameGrid(game);

		playerData = new PlayerData(game, 1);
	}

	private void setupLayout() {
		JPanel pCenter, pSouth;

		cardManager = new CardLayout();

		pEast = new JPanel();

		pEast.setLayout(cardManager);

		pEast.add(optionPanel, "Starter");
		pEast.add(optionPane2, "Main");
                pEast.add(optionPane3, "ArchersAttack");


		setLayout(new BorderLayout());
		pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pSouth = new JPanel();
		pSouth.add(playerData);
		add(pCenter, BorderLayout.CENTER);
		pCenter.add(pSouth, BorderLayout.SOUTH);
		add(pEast, BorderLayout.EAST);
		pCenter.add(theGrid, BorderLayout.CENTER);
		validate();
	}

	@Override
	public void update(Observable o, Object arg) {

		if (game.getState() instanceof AwaitBeginning) {
			cardManager.show(pEast, "Starter");
		}
		if (game.getState() instanceof AwaitTopCardToBeDrawn) {
			game.drawTopCard();
			//cardManager.show(pEast, "Main");
		}
                
                if (game.getState() instanceof AwaitActionSelection) {
			cardManager.show(pEast, "Main");
		}
                if (game.getState() instanceof AwaitEnemyTrackSelectionForArchersAttack) {
			cardManager.show(pEast, "ArchersAttack");
		}
	}
}
