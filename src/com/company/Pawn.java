package com.company;
public class Pawn extends ChessPiece {
    boolean checkFirstMove;

    public Pawn(){

    }
    public Pawn(boolean firstMove) {
        checkFirstMove=firstMove;
    }
    public boolean move(int a, int b, int c, int d) throws OutOfBoardException{
        if(d>=8||c>=8) {
            tof = false;
            throw new OutOfBoardException("Invalid Board Position. (" + a + "," + b + ")" + " (" + c + "," + d + ")" + "\n=======================================");
        }
        else if(!checkFirstMove && d==b+2||d==b+1){
            tof=true;
            checkFirstMove=false;
            }
        else if(checkFirstMove && d==b+1){
                tof=true;
        }
        else {
            tof=false;
        }
        return tof;
    }
}
