package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE;
import java.io.Serializable;

/**
 * Enemy class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Enemy implements Serializable {

  private static final long serialVersionUID = 1L;
  private String name;
  private final int initialStrength;
  private int strength;
  private int position;

  /**
   * Constructor for Enemy.
   *
   * @param name a {@link java.lang.String} object.
   * @param strength a int.
   */
  public Enemy(String name, int strength) {
    this.name = name;
    this.strength = strength;
    this.position = 4;
    this.initialStrength = strength;
  }

  /**
   * Getter for the field <code>name</code>.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for the field <code>name</code>.
   *
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for the field <code>strength</code>.
   *
   * @return the strength
   */
  public int getStrength() {
    return strength;
  }

  /**
   * Setter for the field <code>strength</code>.
   *
   * @param strength the strength to set
   */
  public void setStrength(int strength) {
    this.strength = strength;
  }

  /**
   * Getter for the field <code>position</code>.
   *
   * @return the position
   */
  public int getPosition() {
    return position;
  }

  /**
   * Setter for the field <code>position</code>.
   *
   * @param position the position to set
   */
  public void setPosition(int position) {
    this.position = position;
  }

  /**
   * move. Reveices an enum indicating where to move and move the enemy to that position (UP or
   * DOWN)
   *
   * @param move a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.MOVE} object.
   */
  public void move(MOVE move) {
    if (move == MOVE.UP) {
      this.position--;
    } else if (move == MOVE.DOWN) {
      this.position++;
    }
    if (this.position > 4) {
      this.position = 4;
    } else if (this.position < 0) {
      this.position = 0;
    }
  }

  /** resetStrenght. Resets the strength */
  public void resetStrenght() {
    if (this.position != 0) {

      this.strength = getInitialStrength();
    }
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    String s;

    s = "Enemy: " + getName();
    s += "\n\t" + "Strength: " + getStrength();
    s += "\n\t" + "Position: " + getPosition();
    return s;
  }

  /**
   * Getter for the field <code>initialStrength</code>. returns the initial strenght of the enemy
   *
   * @return a int.
   */
  public int getInitialStrength() {
    return initialStrength;
  }

  public void reset() {
    this.strength = this.initialStrength;
    this.position = 4;
  }
}
