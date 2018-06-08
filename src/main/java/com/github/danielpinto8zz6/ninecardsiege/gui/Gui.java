package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

public class Gui extends JFrame implements Observer {
	private static final long serialVersionUID = 1L;

	ObservableGame game;
	GamePanel panel;

	public Gui(ObservableGame game) {
		super("9CardSiege");
		this.game = game;
		game.addObserver(this);
		panel = new GamePanel(game);

		addComponents();

		setVisible(true);
		this.setSize(1000, 500);
		setResizable(false);
		// this.setMinimumSize(new Dimension(650, 450));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		validate();
	}

	private void addComponents() {
		final Container cp = getContentPane();

		cp.setLayout(new BorderLayout());
		cp.add(panel, BorderLayout.CENTER);
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}
}
