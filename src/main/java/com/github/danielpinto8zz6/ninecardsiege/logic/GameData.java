package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card1;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card2;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card3;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card4;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card5;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card6;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card7;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GameData class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public final class GameData implements Constants, Serializable {

  private static final long serialVersionUID = 1L;

  private final Player player;

  private int day;
  private int endGame;
  private final BattleCard battleCard;
  private final StatusCard statusCard;

  /** This vector of string aggregate all the game logs to eventually be displayed by the game UI */
  private final List<String> msgLog;

  private List<Card> cards = new ArrayList<>();

  /** Constructor for GameData. */
  public GameData() {

    /** Creates player with default name */
    this.player = new Player(this, "Player");
    this.day = 1;
    this.endGame = 1;
    battleCard = new BattleCard(this);
    statusCard = new StatusCard(this);

    addCards();

    shuffleCards();

    msgLog = new ArrayList<>();
  }

  /** addCards. Adds all the existing cards to the game */
  public void addCards() {
    cards.add(new Card1(this));
    cards.add(new Card2(this));
    cards.add(new Card3(this));
    cards.add(new Card4(this));
    cards.add(new Card5(this));
    cards.add(new Card6(this));
    cards.add(new Card7(this));
  }

  /**
   * Getter for the field <code>day</code>.
   *
   * @return the day
   */
  public int getDay() {
    return day;
  }

  /**
   * Setter for the field <code>day</code>.
   *
   * @param day the day to set
   */
  public void setDay(int day) {
    this.day = day;
  }

  /**
   * Getter for the field <code>battleCard</code>.
   *
   * @return the battleCard
   */
  public BattleCard getBattleCard() {
    return battleCard;
  }

  public int getEndGame() {
    return endGame;
  }

  public void setEndGame(int endGame) {
    this.endGame = endGame;
  }

  /**
   * Getter for the field <code>statusCard</code>.
   *
   * @return the statusCard
   */
  public StatusCard getStatusCard() {
    return statusCard;
  }

  /**
   * getEnemy.
   *
   * @param name a {@link java.lang.String} object.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Enemy} object.
   * @throws com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException if
   *     any.
   */
  public Enemy getEnemy(String name) throws EnemyNotFoundException {
    return getBattleCard().getEnemy(name);
  }

  /**
   * getEnemies.
   *
   * @return a {@link java.util.List} object.
   */
  public List<Enemy> getEnemies() {
    return getBattleCard().getEnemies();
  }

  /** clearMsgLog. */
  public void clearMsgLog() {
    msgLog.clear();
  }

  /**
   * addMsgLog.
   *
   * @param msg a {@link java.lang.String} object.
   */
  public void addMsgLog(String msg) {
    msgLog.add(msg);
  }

  /**
   * Getter for the field <code>msgLog</code>.
   *
   * @return a {@link java.util.List} object.
   */
  public List<String> getMsgLog() {
    return msgLog;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    String s;

    s = "Day: " + getDay();
    s += "\n\n" + getPlayer().toString();
    s += "\n\n" + getStatusCard().toString();
    s += "\n\n" + getBattleCard().toString();

    s = getEnemies().stream().map((enemy) -> "\n\n" + enemy.toString()).reduce(s, String::concat);

    return s;
  }

  /**
   * Getter for the field <code>player</code>.
   *
   * @return the player
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * Getter for the field <code>cards</code>.
   *
   * @return the cards
   */
  public List<Card> getCards() {
    return cards;
  }

  /**
   * Setter for the field <code>cards</code>.
   *
   * @param cards the cards to set
   */
  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

  /** shuffleCards. Shuffle all the existing cards in the deck (list) with the collections method */
  public void shuffleCards() {
    Collections.shuffle(cards);
  }

  /** reset. */
  public void reset() {
    this.day = 1;

    getCards().clear();

    addCards();

    shuffleCards();

    getBattleCard().reset();
    getStatusCard().reset();
    getPlayer().reset();
  }
}
