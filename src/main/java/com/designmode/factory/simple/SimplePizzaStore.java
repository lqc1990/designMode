package com.designmode.factory.simple;

import com.designmode.factory.Pizza;

/**
 * @author lqc
 */
public class SimplePizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public final void orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
    }
}
