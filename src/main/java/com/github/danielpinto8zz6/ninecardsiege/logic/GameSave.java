package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSave {
    public static void saveGameToFile(Game game, String fileName) throws IOException {
        ObjectOutputStream oout = null;

        try {
            //Create an object output stream connected to a file named fileName.
            oout = new ObjectOutputStream(new FileOutputStream(fileName));

            //Write/serialize the game object to the open object output stream.
            oout.writeObject(game);

        } finally {

            //If the object output stream was successfuly created, close it.
            if (oout != null) {
                oout.close();
            }
        }
    }

    public static Game retrieveGameFromFile(String fileName) throws ClassNotFoundException, IOException {
        ObjectInputStream oin = null;

        try {
            //Create an object input stream connected to a file named fileName.
            oin = new ObjectInputStream(new FileInputStream(fileName));

            //Retrieve a serialized instance of ThreeInRowGame from the object input stream and return a reference to it.
            return (Game) oin.readObject();

        } finally {
            //If the object input stream was successfuly created, close it.
            if (oin != null) {
                oin.close();
            }
        }
    }
}
