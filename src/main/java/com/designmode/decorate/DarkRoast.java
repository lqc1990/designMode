package com.designmode.decorate;

/**
 * @author lqc
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        describe = "darkRoast";
    }

    @Override
    public Double cost() {
        return 1.1;
    }
}
