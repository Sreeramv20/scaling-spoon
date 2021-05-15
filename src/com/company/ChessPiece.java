package com.company;

public abstract class ChessPiece {
    public boolean tof=false;
    public String pieceName;

    public int positioni=0;
    public int positionj=0;
    public int movecount=0;

    public boolean move(int a, int b, int c, int d) throws OutOfBoardException {
        return tof;
    }

    public ChessPiece() {
    }

    public int getPositioni() {
        return positioni;
    }

    public int getPositionj() {
        return positionj;
    }

    public void setPositioni(int positioni) {
        this.positioni = positioni;
    }

    public void setPositionj(int positionj) {
        this.positionj = positionj;
    }
    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }
}
