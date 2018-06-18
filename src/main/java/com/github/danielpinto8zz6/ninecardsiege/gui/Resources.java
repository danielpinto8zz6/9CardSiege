package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.net.URL;

/**
 * <p>Resources class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Resources {

	/**
	 * <p>getResourceFile.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 * @return a {@link java.net.URL} object.
	 */
	public static final URL getResourceFile(String name) {
		// opens file with path relative to location of the Resources class
		final URL url = Resources.class.getResource(name);
		return url;
	}
}
