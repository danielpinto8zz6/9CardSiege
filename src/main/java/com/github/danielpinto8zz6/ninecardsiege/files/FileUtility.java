package com.github.danielpinto8zz6.ninecardsiege.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>FileUtility class.</p>
 *
 * @author Jose Marinho
 * @version $Id: $Id
 */
public class FileUtility {

	/** Constant <code>FILE_TO_SAVE_GAME="savedgame.bin"</code> */
	public static final String FILE_TO_SAVE_GAME = "savedgame.bin";

	/**
	 * <p>retrieveGameFromFile.</p>
	 *
	 * @param file a {@link java.io.File} object.
	 * @return a {@link java.lang.Object} object.
	 * @throws java.io.IOException if any.
	 * @throws java.lang.ClassNotFoundException if any.
	 */
	public static Object retrieveGameFromFile(File file) throws IOException, ClassNotFoundException {
		ObjectInputStream oin = null;

		try {

			oin = new ObjectInputStream(new FileInputStream(file));
			return oin.readObject();

		} finally {
			if (oin != null) {
				oin.close();
			}
		}
	}

	/**
	 * <p>saveGameToFile.</p>
	 *
	 * @param file a {@link java.io.File} object.
	 * @param o a {@link java.lang.Object} object.
	 * @throws java.io.IOException if any.
	 */
	public static void saveGameToFile(File file, Object o) throws IOException {
		ObjectOutputStream oout = null;

		try {

			oout = new ObjectOutputStream(new FileOutputStream(file));
			oout.writeObject(o);

		} finally {
			if (oout != null) {
				oout.close();
			}
		}
	}

}
