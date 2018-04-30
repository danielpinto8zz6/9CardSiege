package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>
 * GameSave class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class GameSave {

    /**
     * <p>
     * saveGameToFile.</p>
     *
     * @param game a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Game}
     * object.
     * @param fileName a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
    public static void saveGameToFile(Game game, String fileName) throws IOException {
        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(fileName)) //If the object output stream was successfuly created, close it.
                ) {

            //Write/serialize the game object to the open object output stream.
            oout.writeObject(game);

        }
    }

    /**
     * <p>
     * retrieveGameFromFile.</p>
     *
     * @param fileName a {@link java.lang.String} object.
     * @return a {@link java.lang.Object} object.
     * @throws java.lang.ClassNotFoundException if any.
     * @throws java.io.IOException if any.
     */
    public static Object retrieveGameFromFile(String fileName) throws ClassNotFoundException, IOException {
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName)) //If the object input stream was successfuly created, close it.
                ) {

            //Retrieve a serialized instance of ThreeInRowGame from the object input stream and return a reference to it.
            return oin.readObject();

        }
    }
}
