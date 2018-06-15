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

    public static Point getCardCoordinatesTodraw(int width, int height, double scaleW, double scaleH, int x, int y) {
        Point coordinates;

        int drawX = (int) ((width * scaleW) / 100) + x;
        int drawY = (int) ((height * scaleH) / 100) + y;

        coordinates = new Point(drawX, drawY);

        return coordinates;
    }

    /** Piece height / width is 10% of the card height */
    public static int getPieceScaledSize(int height, int scale) {
        int size;

        size = (int) (height * scale) / 100;

        return size;
    }
}