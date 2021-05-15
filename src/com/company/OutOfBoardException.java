package com.company;

public class OutOfBoardException extends Exception{
    public OutOfBoardException(String error) {
        System.out.println(error);
    }
}
