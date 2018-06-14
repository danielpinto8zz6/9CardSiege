package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.awt.Dimension;
import java.awt.Point;

class Utils {
    public static double getScaleFactor(int iMasterSize, int iTargetSize) {

        double dScale = 1;
        if (iMasterSize > iTargetSize) {

            dScale = (double) iTargetSize / (double) iMasterSize;

        } else {

            dScale = (double) iTargetSize / (double) iMasterSize;

        }

        return dScale;

    }

    public static double getScaleFactorToFit(Dimension original, Dimension toFit) {

        double dScale = 1d;

        if (original != null && toFit != null) {

            double dScaleWidth = getScaleFactor(original.width, toFit.width);
            double dScaleHeight = getScaleFactor(original.height, toFit.height);

            dScale = Math.min(dScaleHeight, dScaleWidth);

        }

        return dScale;

    }

    public static Point getCardCoordinatesTodraw(int x, int y, int posX, int posY) {
        Point coordinates;

        coordinates = new Point(x + posX, y + posY);

        return coordinates;
    }

    public static int getPieceScaledSize(int x) {
        int size;

        size = x / 8;

        return size;
    }
}