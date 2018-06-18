/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

// import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/**
 * <p>
 * AttackSelectioPanel class.
 * </p>
 *
 * @author tiago_000
 * @version $Id: $Id
 */
public class AttackSelectioPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	ObservableGame game;
	JButton bt1 = new JButton("Attack");
	JButton bt2 = new JButton("Target: Battle Ram");
	JButton bt3 = new JButton("Target: Siege Engine");
	JButton dNA = new JButton("Do Not Attack");
	JButton end = new JButton("End Game");
	String[] enemieString = { "Ladders", "BattleRam", "SiegeTower" };
	JLabel msg;
	JComboBox<String> enemieS = new JComboBox<>(enemieString);

	AttackSelectioPanel(ObservableGame g) {

		game = g;
		msg = new JLabel();

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(false);
	}

	private void setupComponents() {

		bt1.addActionListener(ev -> game.attack((String) enemieS.getSelectedItem()));
		dNA.addActionListener(ev -> game.callMenu());
		end.addActionListener(ev -> System.exit(0));

	}

	private void setupLayout() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		msg.setAlignmentX(Component.CENTER_ALIGNMENT);
		msg.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		msg.setText("Select the enemy:");
		msg.setFont(new Font("Dialog", Font.BOLD, 17));
		add(msg);

		enemieS.setMaximumSize(enemieS.getPreferredSize());
		enemieS.setSelectedIndex(0);
		add(enemieS);

		bt1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt1);

		dNA.setAlignmentX(Component.CENTER_ALIGNMENT);
		dNA.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(dNA);

		end.setAlignmentX(Component.CENTER_ALIGNMENT);
		end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(end);

		validate();

	}

}
