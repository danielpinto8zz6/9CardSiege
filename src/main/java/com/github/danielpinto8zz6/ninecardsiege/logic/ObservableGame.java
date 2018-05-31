package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;
import java.util.Observable;

public class ObservableGame extends Observable {
  Game game;

  public ObservableGame() {
    game = new Game();
  }

  public Game getGame() {
    return game;
  }

  public void setGameModel(Game game) {
    this.game = game;

    setChanged();
    notifyObservers();
  }

  public GameData getGameData() {
    return game.getGameData();
  }

  public IStates getState() {
    return game.getState();
  }

  // Methods retrieve data from the game

  public Player getPlayer() {
    return game.getGameData().getPlayer();
  }

  public void start() {
    game.start();
    setChanged();
    notifyObservers();
  }

  public void finish() {
    game.finish();
    notifyObservers();
  }

  public boolean isOver() {
    return game.isOver();
  }

  public void setPlayerName(String text) {
    game.getGameData().getPlayer().setName(text);
    setChanged();
    notifyObservers();
  }
}
