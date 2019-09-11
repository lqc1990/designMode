package com.designmode.decorate;

/**
 * @author lqc
 */
public abstract class Beverage {

    String describe;

    public String getDescribe() {
        return describe;
    }

    public abstract Double cost();
}
