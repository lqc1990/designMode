package com.designmode.factory;

/**
 * @author lqc
 */
public abstract class PizzaStore {

    public final void orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
    }

    public abstract Pizza createPizza(String type);

}
