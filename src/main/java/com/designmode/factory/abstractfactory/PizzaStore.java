package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public abstract class PizzaStore {

    public void createOrder(String item){
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String item);
}
