/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author tiago_000
 */
public class TunnelMovementPanel extends JPanel {
    
	private static final long serialVersionUID = 1L;
	ObservableGame game;
        
	JButton bt1 = new JButton("Leave the Castle/Enemi lines");
	JButton bt2 = new JButton("Do the free Movement");
	JButton bt3 = new JButton("Do the fast Movement");
	JButton dNM = new JButton("Do Not Move");
	JButton end = new JButton("End Game");

	TunnelMovementPanel(ObservableGame g) {

		game = g;

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(false);
	}

	private void setupComponents() {

		bt1.addActionListener(ev -> game.leaveLocation());
		bt2.addActionListener(ev -> game.attack("BattleRam"));
		bt3.addActionListener(ev -> game.attack("SiegeEngine"));
		dNM.addActionListener(ev -> game.callMenu());
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

		bt3.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt3);

		bt3.setAlignmentX(Component.CENTER_ALIGNMENT);
		bt3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bt3);

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
