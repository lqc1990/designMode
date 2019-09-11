package com.designmode.decorate;

/**
 * @author lqc
 */
public class Mocha extends CondimentDecorate {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe() + "Mocha \n";
    }

    @Override
    public Double cost() {
        return 1.1 + beverage.cost();
    }
}
