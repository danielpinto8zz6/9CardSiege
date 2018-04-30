package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * GameOver class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class GameOver extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for GameOver.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public GameOver(GameData g) {
    super(g);
  }
}
