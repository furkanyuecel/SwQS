package com.mycompany.app.exercise5;

public class BoxEmptyException extends Exception {
    public BoxEmptyException() {
        super("Box is empty");
    }
}