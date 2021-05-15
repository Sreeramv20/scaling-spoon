package com.company;

public class King extends ChessPiece {
    public King(int a, int b) {
        setPositioni(b);
        setPositionj(a);
    }

    public boolean move(int a, int b, int c, int d) throws OutOfBoardException {
        if (c >= 8 || d >= 8) {
            tof = false;
            throw new OutOfBoardException("Invalid Board Position. ("+a+","+b+")"+" ("+c+","+d+")"+"\n=======================================");
        } else if (c == a + 1 || c == a - 1 && d == b + 1 || d == b - 1) {
            tof = true;
        } else {
            tof = false;
        }
        return tof;
    }
}
