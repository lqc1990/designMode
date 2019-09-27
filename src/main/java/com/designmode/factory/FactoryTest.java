package com.designmode.factory;

/**
 * @author lqc
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicageStylePizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println(nyPizza.getName());
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoPizza.getName());
    }
}
