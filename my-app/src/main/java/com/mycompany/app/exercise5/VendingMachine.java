package com.mycompany.app.exercise5;

public interface VendingMachine {
    void selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;
}