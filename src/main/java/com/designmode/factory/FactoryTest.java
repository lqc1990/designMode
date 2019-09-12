package com.designmode.factory;

/**
 * @author lqc
 */
public class FactoryTest {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

    }
}
