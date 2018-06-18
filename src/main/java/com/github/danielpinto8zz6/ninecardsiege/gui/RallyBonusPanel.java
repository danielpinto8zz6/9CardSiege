/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/**
 * <p>RallyBonusPanel class.</p>
 *
 * @author tiago_000
 * @version $Id: $Id
 */
public class RallyBonusPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	ObservableGame game;

	JButton bt1 = new JButton("Trade 1 of moral for bonus");
	JButton bt2 = new JButton("without bonus");
	JButton dNR = new JButton("Do Not Rally");
	JButton end = new JButton("End Game");

	RallyBonusPanel(ObservableGame g) {

		game = g;

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();
		setVisible(false);
	}

	private void setupComponents() {
		bt1.addActionListener(ev -> game.applyRallyTroops(true));
		bt2.addActionListener(ev -> game.applyRallyTroops(false));
		dNR.addActionListener(ev -> game.callMenu());
		end.addActionListener(ev -> System.exit(0));
	}

	private void setupLayout() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		bt1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt1);

		bt2.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt2);

		dNR.setAlignmentX(Component.CENTER_ALIGNMENT);
		dNR.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(dNR);

		end.setAlignmentX(Component.CENTER_ALIGNMENT);
		end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(end);

		validate();

	}
}
