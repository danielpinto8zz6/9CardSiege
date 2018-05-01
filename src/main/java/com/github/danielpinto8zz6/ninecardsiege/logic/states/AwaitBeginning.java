package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitBeginning class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitBeginning extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for AwaitBeginning.
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public AwaitBeginning(GameData g) {
        super(g);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates start() {
        return new AwaitTopCardToBeDrawn(getGameData());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates finish() {
        return new GameOver(getGameData());
    }
}
