package com.company;
public class Pawn extends ChessPiece {
    boolean checkFirstMove;

    public Pawn(){

    }
    public Pawn(boolean firstMove) {
        checkFirstMove=firstMove;
    }
    public boolean move(ChessBoard n, int a, int b, int c, int d) throws OutOfBoardException {
        int [][]x = new int[8][8];

        if(d>=8||c>=8) {
            tof = false;
            throw new OutOfBoardException("Invalid Board Position. (" + a + "," + b + ")" + " (" + c + "," + d + ")" + "\n=======================================");
        }
        else if(!checkFirstMove && d==b+2||d==b+1){
            tof=true;
            checkFirstMove=false;
            x[0]= new int[]{c, d-1};
            x[1]= new int[]{c, d};
            }
        else if(checkFirstMove && d==b+1){
                tof=true;
                x[0]= new int[]{c, d};
        }
        else {
            tof=false;
        }
//        if(tof){
//
//            return isPathValid(n, x);
//        }
//        return false;
        return tof;
    }

    public String getPieceName() {
        return "pawn";
    }
    public String getSymbol() {
        return "-p- ";
    }

    @Override
    public boolean isPathValid(ChessBoard n, int[][] x){
        try {
            return super.isPathValid(n, x);
        }
        catch (PathwayException e){
            System.out.println("PathwayException");
        }
        return false;
    }
}
