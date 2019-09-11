package com.designmode.decorate;

/**
 * @author lqc
 */
public class Decaf extends Beverage {

    public Decaf() {
        describe = "decaf";
    }

    @Override
    public Double cost() {
        return 2.0;
    }
}
