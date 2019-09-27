package com.designmode.factory;

/**
 * @author lqc
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
