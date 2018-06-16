/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Component;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/**
 *
 * @author tiago_000
 */
public class TunnelMovementPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ObservableGame game;

	JButton bt1 = new JButton("Leave the Castle/Enemi lines");
	JButton lf1 = new JButton("Left");
	JButton ri1 = new JButton("Right");
	JButton lf2 = new JButton("Left");
	JButton ri2 = new JButton("Right");
	JButton dNM = new JButton("Do Not Move");
	JButton end = new JButton("End Game");
	JLabel fre;
	JLabel fas;

	TunnelMovementPanel(ObservableGame g) {

		game = g;
		fre = new JLabel();
		fas = new JLabel();

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(false);
	}

	private void setupComponents() {

		bt1.addActionListener(ev -> game.leaveLocation());
		lf1.addActionListener(ev -> game.freeMovement(true));
		ri1.addActionListener(ev -> game.freeMovement(false));
		lf2.addActionListener(ev -> game.fastMovement(true));
		ri2.addActionListener(ev -> game.fastMovement(false));
		dNM.addActionListener(ev -> game.callMenu());
		end.addActionListener(ev -> System.exit(0));

	}

	private void setupLayout() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		fre.setAlignmentX(Component.CENTER_ALIGNMENT);
		fre.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		fre.setText("Do the free Movement");
		fre.setFont(new Font("Dialog", Font.BOLD, 17));
		add(fre);

		ri1.setAlignmentX(Component.CENTER_ALIGNMENT);
		ri1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(ri1);

		lf1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lf1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(lf1);

		fas.setAlignmentX(Component.CENTER_ALIGNMENT);
		fas.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		fas.setText("Do the fast Movement");
		fas.setFont(new Font("Dialog", Font.BOLD, 17));
		add(fas);

		ri2.setAlignmentX(Component.CENTER_ALIGNMENT);
		ri2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(ri2);

		lf2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lf2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(lf2);

		bt1.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt1);
		dNM.setAlignmentX(Component.CENTER_ALIGNMENT);
		dNM.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(dNM);

		end.setAlignmentX(Component.CENTER_ALIGNMENT);
		end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(end);

		validate();

	}

}
