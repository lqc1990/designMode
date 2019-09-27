package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public class ReggianoChess implements Cheese{

    @Override
    public void createCheese() {
        System.out.println("Reggiano is create");
    }
}
