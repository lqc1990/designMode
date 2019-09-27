package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public class FactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.createOrder("cheese");
    }
}
