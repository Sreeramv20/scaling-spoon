package com.company;

public class Queen extends ChessPiece{
    public Queen(int a, int b) {
        setPositioni(b);
        setPositionj(a);
    }
    public boolean move(ChessBoard n, int a, int b, int c, int d) throws OutOfBoardException {
        if(c>=8||d>=8){
            tof=false;
            throw new OutOfBoardException("Invalid Board Position. ("+a+","+b+")"+" ("+c+","+d+")"+"\n=======================================");
        }
        else if(a == c || b == d){
            tof=true;
        }
        else if(c == a + 1 | c == a - 1 && d == b + 1 || d == b - 1){
            tof=true;
        }
        else if(Math.abs(a-c)==Math.abs(b-d)){
            tof=true;
        }
        else {
            tof=false;
        }
        return tof;
    }
    public String getPieceName() {
        return "queen";
    }
    public String getSymbol() {
        return "-Q- ";
    }
}
