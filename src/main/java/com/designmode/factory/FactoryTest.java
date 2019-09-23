package com.designmode.factory;

/**
 * @author lqc
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicageStylePizzaStore();
        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("cheese");
    }
}
