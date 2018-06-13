package com.github.danielpinto8zz6.ninecardsiege;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.github.danielpinto8zz6.ninecardsiege.gui.Gui;
import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;

/**
 * App class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class App {

	/**
	 * main.
	 *
	 * @param args
	 *            an array of {@link java.lang.String} objects.
	 */
	public static void main(String[] args) {

		/**
		 * Windows look & Feel
		 */
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		new Gui(new ObservableGame());
	}
}
