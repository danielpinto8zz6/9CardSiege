package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.net.URL;

public class Resources {

	public static final URL getResourceFile(String name) {
		// opens file with path relative to location of the Resources class
		final URL url = Resources.class.getResource(name);
		return url;
	}
}
