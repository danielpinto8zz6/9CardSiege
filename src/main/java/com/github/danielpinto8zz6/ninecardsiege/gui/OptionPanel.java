/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.danielpinto8zz6.ninecardsiege.gui;

// import java.awt.Color;
import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/** @author tiago_000 */
/**
 * <p>
 * OptionPanel class.
 * </p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class OptionPanel extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;

	ObservableGame game;

	JButton aAt = new JButton("Archers Attack");
	JButton bWA = new JButton("Boilling Watter Attack");
	JButton cCA = new JButton("Close Combat Attack");
	JButton Cou = new JButton("Coupure");
	JButton ral = new JButton("Rally");
	JButton tMo = new JButton("Tunnel Movement");
	JButton sRa = new JButton("Supply Raid");
	JButton sab = new JButton("Sabotage");
	JButton eAP = new JButton("Extra Action Point");
	JButton nTu = new JButton("Next Turn");
	JButton end = new JButton("End Game");

	OptionPanel(ObservableGame g) {

		game = g;
		game.addObserver(this);

		// setBackground(Color.GRAY);
		setupComponents();
		setupLayout();

		setVisible(false);
	}

	private void setupComponents() {

		aAt.addActionListener(ev -> game.archersAttack());
		bWA.addActionListener(ev -> game.boilingWaterAttack());
		cCA.addActionListener(ev -> game.closeCombatAttack());
		Cou.addActionListener(ev -> game.coupure());
		ral.addActionListener(ev -> game.rallyTroops());
		tMo.addActionListener(ev -> game.tunnelMovement());
		sRa.addActionListener(ev -> game.supplyRaid());
		sab.addActionListener(ev -> game.sabotage());
		eAP.addActionListener(ev -> game.extraActionPoint());
		nTu.addActionListener(ev -> game.endOfTurn());
		end.addActionListener(ev -> game.over());
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

		sab.setAlignmentX(Component.CENTER_ALIGNMENT);
		sab.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(sab);

		eAP.setAlignmentX(Component.CENTER_ALIGNMENT);
		eAP.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(Box.createVerticalStrut(10));
		add(eAP);

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

	/** {@inheritDoc} */
	@Override
	public void update(Observable o, Object arg) {
		aAt.setEnabled(game.getPlayer().isCanArchersAtack());
		bWA.setEnabled(game.getPlayer().isCanBoilingWater());
		cCA.setEnabled(game.getPlayer().isCanCloseCombat());
		Cou.setEnabled(game.getPlayer().isCanCoupure());
		ral.setEnabled(game.getPlayer().isCanRallyTroops());
		tMo.setEnabled(game.getPlayer().isCanTunnelMovement());
		eAP.setEnabled(game.getPlayer().isCanExtraAP());
	}
}
