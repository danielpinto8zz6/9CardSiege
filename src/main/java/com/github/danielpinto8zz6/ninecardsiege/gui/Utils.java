package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Dimension;
import java.awt.Point;

class Utils {
	/**
	 * <p>getCardCoordinatesTodraw.</p>
	 *
	 * @param width a int.
	 * @param height a int.
	 * @param scaleW a double.
	 * @param scaleH a double.
	 * @param x a int.
	 * @param y a int.
	 * @return a {@link java.awt.Point} object.
	 */
	public static Point getCardCoordinatesTodraw(int width, int height, double scaleW, double scaleH, int x, int y) {
		Point coordinates;

		final int drawX = (int) ((width * scaleW) / 100) + x;
		final int drawY = (int) ((height * scaleH) / 100) + y;

		coordinates = new Point(drawX, drawY);

		return coordinates;
	}

	/**
	 * Piece height / width is 10% of the card height
	 *
	 * @param height a int.
	 * @param scale a double.
	 * @return a int.
	 */
	public static int getPieceScaledSize(int height, double scale) {
		int size;

		size = (int) (height * scale) / 100;

		return size;
	}

	/**
	 * <p>getScaleFactor.</p>
	 *
	 * @param iMasterSize a int.
	 * @param iTargetSize a int.
	 * @return a double.
	 */
	public static double getScaleFactor(int iMasterSize, int iTargetSize) {

		double dScale = 1;
		if (iMasterSize > iTargetSize) {

			dScale = (double) iTargetSize / (double) iMasterSize;

		} else {

			dScale = (double) iTargetSize / (double) iMasterSize;

		}

		return dScale;

	}

	/**
	 * <p>getScaleFactorToFit.</p>
	 *
	 * @param original a {@link java.awt.Dimension} object.
	 * @param toFit a {@link java.awt.Dimension} object.
	 * @return a double.
	 */
	public static double getScaleFactorToFit(Dimension original, Dimension toFit) {

		double dScale = 1d;

		if ((original != null) && (toFit != null)) {

			final double dScaleWidth = Utils.getScaleFactor(original.width, toFit.width);
			final double dScaleHeight = Utils.getScaleFactor(original.height, toFit.height);

			dScale = Math.min(dScaleHeight, dScaleWidth);

		}

		return dScale;

	}
}
