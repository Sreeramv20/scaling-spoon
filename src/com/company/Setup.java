package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Setup {

    public static void main(String[] args) throws FileNotFoundException, OutOfBoardException {
        Scanner scan = new Scanner(new File("input1.txt"));
        String line;
        String[] lineSegment;
        ChessBoard n = new ChessBoard("--- ",8);
        while(scan.hasNextLine())
        {
            line = scan.nextLine();
            lineSegment = line.split(" "); // stores all input in array of Strings
            n.setPiece(lineSegment[0],Integer.parseInt(lineSegment[1]),Integer.parseInt(lineSegment[2]));
        }
        System.out.println(n);
    }
}
