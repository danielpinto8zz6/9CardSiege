package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * AwaitBeginning class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitBeginning extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Constructor for AwaitBeginning.</p>
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
    public IStates Start() {
        return new AwaitTopCardToBeDrawn(getGame());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
