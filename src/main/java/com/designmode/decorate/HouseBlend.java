package com.designmode.decorate;

/**
 * @author lqc
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        describe="HouseBlend \n";
    }

    @Override
    public Double cost() {
        return 0.2;
    }
}
