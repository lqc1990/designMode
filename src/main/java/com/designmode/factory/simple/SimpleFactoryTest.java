package com.designmode.factory.simple;

/**
 * @author lqc
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(factory);
        simplePizzaStore.orderPizza("cheese");
    }
}
