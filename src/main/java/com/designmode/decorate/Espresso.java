package com.designmode.decorate;

/**
 * @author lqc
 */
public class Espresso extends Beverage {

    public Espresso() {
        describe="espresso";
    }

    @Override
    public Double cost() {
        return 0.1;
    }
}
