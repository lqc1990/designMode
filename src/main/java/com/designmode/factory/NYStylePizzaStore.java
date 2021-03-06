package com.designmode.factory;

/**
 * @author lqc
 */
public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        } else if("clam".equals(type)){
            return new NYClamPizza();
        }else {
            throw new RuntimeException("没有寻找到实例");
        }
    }
}
