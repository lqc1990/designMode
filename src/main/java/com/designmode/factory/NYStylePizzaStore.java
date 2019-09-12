package com.designmode.factory;

/**
 * @author lqc
 */
public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if("NYCheese".equals(type)){
            return new NYStyleCheesePizza();
        } else {
            throw new RuntimeException("没有寻找到实例");
        }
    }
}
