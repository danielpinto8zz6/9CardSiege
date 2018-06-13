/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;


/** @author tiago_000 */
public class OptionPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	ObservableGame game;
        
	JButton aAt = new JButton("Archers Attack");
	JButton bWA = new JButton("Boilling Watter Attack");
	JButton cCA = new JButton("Close Combat Attack");
	JButton Cou = new JButton("Coupure");
	JButton ral = new JButton("Rally");
	JButton tMo = new JButton("Tunnel Movemente");
	JButton sRa = new JButton("Supply Raid");
	JButton Sab = new JButton("Sabotage");
	JButton nTu = new JButton("Next Turn");
	JButton end = new JButton("End Game");

	OptionPanel(ObservableGame g) {

		game = g;

		setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(false);
	}

	private void setupComponents() {
            
		aAt.addActionListener(ev -> game.archersAttack());
		end.addActionListener(ev -> System.exit(0));
	}

	private void setupLayout() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
                
		aAt.setAlignmentX(Component.CENTER_ALIGNMENT);
		aAt.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(aAt);
                
                bWA.setAlignmentX(Component.CENTER_ALIGNMENT);
		bWA.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(bWA);
                
                cCA.setAlignmentX(Component.CENTER_ALIGNMENT);
		cCA.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(cCA);
                
                                
                Cou.setAlignmentX(Component.CENTER_ALIGNMENT);
		Cou.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(Cou);
                
                ral.setAlignmentX(Component.CENTER_ALIGNMENT);
		ral.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(ral);
                
                tMo.setAlignmentX(Component.CENTER_ALIGNMENT);
		tMo.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(tMo);
                
                sRa.setAlignmentX(Component.CENTER_ALIGNMENT);
		sRa.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(sRa);
                
                Sab.setAlignmentX(Component.CENTER_ALIGNMENT);
		Sab.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(Sab);
                
                nTu.setAlignmentX(Component.CENTER_ALIGNMENT);
		nTu.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(nTu);
                
                
		end.setAlignmentX(Component.CENTER_ALIGNMENT);
		end.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(end);

		validate();
	}

}
