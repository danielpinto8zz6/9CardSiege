package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import com.github.danielpinto8zz6.ninecardsiege.files.FileUtility;
import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

public class Gui extends JFrame implements Observer {
	class AboutListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(Gui.this,
					"9CardSiege\nProgramação Avançada\nDaniel Pinto 21250143\nTiago Rodrigues 21230180", "About",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	class ExitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	class HelpContentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(Gui.this,
					"Get help at: https://boardgamegeek.com/boardgame/224596/9-card-siege", "Help Contents",
					JOptionPane.PLAIN_MESSAGE);
		}
	}

	class LoadObjMenuBarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			final JFileChooser fc = new JFileChooser("./data");
			final int returnVal = fc.showOpenDialog(Gui.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				final File file = fc.getSelectedFile();
				try {
					game.setGame((Game) FileUtility.retrieveGameFromFile(file));
				} catch (IOException | ClassNotFoundException ex) {
					JOptionPane.showMessageDialog(Gui.this, "Operation failed: \r\n\r\n" + e);
				}

			} else {
				System.out.println("Operation canceled ");
			}
		}
	}

	class SaveObjMenuBarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			final JFileChooser fc = new JFileChooser("./data");
			final int returnVal = fc.showSaveDialog(Gui.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				final File file = fc.getSelectedFile();
				try {
					FileUtility.saveGameToFile(file, game.getGame());
				} catch (final IOException ex) {
					JOptionPane.showMessageDialog(Gui.this, "Operation failed: \r\n\r\n" + e);
				}
			} else {
				System.out.println("Operation canceled ");
			}
		}
	}

	private static final long serialVersionUID = 1L;

	ObservableGame game;

	GamePanel panel;

	public Gui(ObservableGame game) {
		super("9CardSiege");
		this.game = game;
		game.addObserver(this);
		panel = new GamePanel(game);

		addComponents();
		menus();

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

	private void menus() {
		final JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// game menu
		final JMenu gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);

		final JMenuItem readObjJMI = new JMenuItem("Load");
		readObjJMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

		final JMenuItem saveObjJMI = new JMenuItem("Save");
		saveObjJMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

		final JMenuItem exitJMI = new JMenuItem("Exit");
		exitJMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

		gameMenu.add(readObjJMI);
		gameMenu.add(saveObjJMI);
		gameMenu.addSeparator();
		gameMenu.add(exitJMI);
		menuBar.add(gameMenu);

		readObjJMI.addActionListener(new LoadObjMenuBarListener());
		saveObjJMI.addActionListener(new SaveObjMenuBarListener());
		exitJMI.addActionListener(new ExitListener());

		// help menu
		final JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);

		final JMenuItem helpContentJMI = new JMenuItem("Help Contents");
		helpContentJMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));

		final JMenuItem aboutJMI = new JMenuItem("About");
		aboutJMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));

		helpMenu.add(helpContentJMI);
		helpMenu.add(aboutJMI);
		menuBar.add(helpMenu);

		helpContentJMI.addActionListener(new HelpContentListener());
		aboutJMI.addActionListener(new AboutListener());
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

}
