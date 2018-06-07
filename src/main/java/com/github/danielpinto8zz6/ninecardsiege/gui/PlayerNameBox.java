package com.github.danielpinto8zz6.ninecardsiege.gui;

import com.github.danielpinto8zz6.ninecardsiege.logic.ObservableGame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Apresenta um label e campo de texto para alteracao do nome de um jogador..
 *
 * @author JMSousa (base)
 */
class PlayerNameBox extends JPanel {
  private static final long serialVersionUID = 1L;
  ObservableGame game;
  JTextField nameField;

  PlayerNameBox(ObservableGame g) {
    String nome;

    game = g;

    nome = g.getPlayer().getName();

    nameField = new JTextField(15);
    nameField.setText(nome);

    // Listen for changes in the text
    nameField
        .getDocument()
        .addDocumentListener(
            new DocumentListener() {

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
    nameField.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            game.setPlayerName(nameField.getText());
            game.start();
          }
        });

    setMaximumSize(new Dimension(200, 40));
    setupLayout();
  }

  private void setupLayout() {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    add(new JLabel("Player " + " name"));
    add(nameField);
  }

  public String getText() {
    return nameField.getText();
  }
}
