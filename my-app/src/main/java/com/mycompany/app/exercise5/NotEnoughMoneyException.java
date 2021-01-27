package com.mycompany.app.exercise5;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Not enough money");
    }
}