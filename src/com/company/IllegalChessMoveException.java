package com.company;

public class IllegalChessMoveException extends Exception{
    public IllegalChessMoveException(String error) {
        System.out.println(error);
    }
}
