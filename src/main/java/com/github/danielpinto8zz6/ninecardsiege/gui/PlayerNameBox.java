package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/**
 * Apresenta um label e campo de texto para alteracao do nome de um jogador..
 *
 * @author JMSousa (base)
 */
class PlayerNameBox extends JPanel {
	private static final long serialVersionUID = 1L;
	ObservableGame game;
	JTextField nameField;
	JTextField actionPoints;

	PlayerNameBox(ObservableGame g) {
		String nome;
		game = g;

		nome = g.getPlayer().getName();

		nameField = new JTextField(15);
		nameField.setText(nome);
		actionPoints = new JTextField(15);
		actionPoints.setText(String.valueOf(game.getGameData().getPlayer().getActionPoints()));

		// Listen for changes in the text
		nameField.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				game.setPlayerName(nameField.getText());
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				game.setPlayerName(nameField.getText());
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				game.setPlayerName(nameField.getText());
			}
		});

		// <Enter> pressed
		nameField.addActionListener(e -> {
			game.setPlayerName(nameField.getText());
			game.start();
		});

		setMaximumSize(new Dimension(200, 40));
		setupLayout();
	}

	public String getText() {
		return nameField.getText();
	}

	private void setupLayout() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JLabel("Player " + " name"));
		add(nameField);

		validate();

	}
}
