package com.company;

import java.util.Locale;

public class ChessBoard {
    private int size;
    private String[][] board = new String[0][0];

    public ChessBoard(String e,int size) {
        board = new String[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = (e);
            }
        }
    }
    public String toString() {
        String x = "";
        for (int i = 7; i >= 0; i--) {
            x+="="+i+"= ";
            for (int j = 0; j < board[i].length; j++) {
                x = x + (board[j][i]);
            }
            x += "\n";
        }
        x+="=== ";
        for(int m=0;m<board.length;m++){
            x+="="+m+"= ";
        }
        return x;
    }
    public boolean setPiece(String s, int i, int j) throws OutOfBoardException {
            if(s.equals("knight")) {
                board[i][j] = "-h- ";
            } else if (s.equals("pawn")) {
                board[i][j] = "-p- ";
            } else if (s.equals("rook")) {
                board[i][j] = "-r- ";
            } else if (s.equals("bishop")) {
                board[i][j] = "-b- ";
            } else if(s.equals("king")){
                board[i][j]="-K- ";
            }
                else if(s.equals("queen")){
                board[i][j]="-Q- ";
            }
            else {
                board[i][j] = "--- ";
            }
            return true;
        }
    public String getpieceName(int g, int h){
        String piecename="";
        if (board[g][h].equals("-h- ")){
            piecename="knight";
        }
        else if(board[g][h].equals("-p- ")){
            piecename="pawn";
        }
        else if (board[g][h].equals("-r- ")){
            piecename="rook";
        }
        else if (board[g][h].equals("-b- ")){
            piecename="bishop";
        }
        else if(board[g][h].equals("-K- ")){
            piecename="king";
        }
        else if(board[g][h].equals("-Q- ")){
            piecename="queen";
        }
        return piecename;
    }
    public void removePiece(int i1,int i2){
        board[i1][i2]="--- ";
    }
   // public ChessPiece getPiece(int i, int j){
      //  return board[i][j];
 //   }
}
