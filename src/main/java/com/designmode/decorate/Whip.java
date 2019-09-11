package com.designmode.decorate;

/**
 * @author lqc
 */
public class Whip extends CondimentDecorate{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe()+"Whip \n";
    }

    @Override
    public Double cost() {
        return 0.3+beverage.cost();
    }
}
