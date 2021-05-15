package com.company;

public class Rook extends ChessPiece{
    public Rook(int a, int b) {
        setPositioni(b);
        setPositionj(a);
    }
    public boolean move(int a, int b, int c, int d) throws OutOfBoardException {
       if(d>=8||c>=8){
           tof=false;
           throw new OutOfBoardException("Invalid Board Position. ("+a+","+b+")"+" ("+c+","+d+")"+"\n=======================================");
       }
       else if(a == c || b == d){
            tof=true;
        }
        else {
            tof=false;
        }
        return tof;
    }
}
