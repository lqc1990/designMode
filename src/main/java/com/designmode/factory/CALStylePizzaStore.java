package com.designmode.factory;

/**
 * @author lqc
 */
public class CALStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new CALStyleCheesePizza();
        }else {
            throw new RuntimeException("没有寻找到实例");
        }
    }
}
