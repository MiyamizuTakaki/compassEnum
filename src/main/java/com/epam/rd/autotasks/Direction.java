package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }
    public final static int  MIN_AGX = 0;
    public final static int  MAX_AGX = 360;
    private int degrees;
    public static Direction ofDegrees(int degrees) {
        try{
            while(degrees<0||degrees>=360)
            {
                if(degrees<0)
                    degrees = degrees+360;
                else if(degrees>=360)
                    degrees = degrees-360;
            }
            switch (degrees){
                case 0:
                    return N;
                case 45:
                    return NE;
                case 90:
                    return E;
                case 135:
                    return SE;
                case 180:
                    return S;
                case 225:
                    return SW;
                case 270:
                    return W;
                case 315:
                    return NW;
                default:
                    return null;
            }
        }catch (Exception e)
        {
            throw new UnsupportedOperationException();
        }

    }

    public static Direction closestToDegrees(int degrees) {
        throw new UnsupportedOperationException();
    }

    public Direction opposite() {
        throw new UnsupportedOperationException();
    }

    public int differenceDegreesTo(Direction direction) {
        throw new UnsupportedOperationException();
    }
}
