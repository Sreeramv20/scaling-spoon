package com.company;

public class Bishop extends ChessPiece{
    public Bishop(int a, int b) {
        setPositioni(b);
        setPositionj(a);
    }
    public boolean move(int a, int b, int c, int d) throws OutOfBoardException {
        if(c>=8||d>=8){
            tof=false;
            throw new OutOfBoardException("Invalid Board Position. ("+a+","+b+")"+" ("+c+","+d+")"+"\n=======================================");
        }
        else if(Math.abs(a-c)==Math.abs(b-d)){
            tof=true;
        }
        else {
            tof=false;
        }
        return tof;
    }
}
