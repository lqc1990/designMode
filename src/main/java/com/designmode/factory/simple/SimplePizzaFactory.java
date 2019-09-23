package com.designmode.factory.simple;

import com.designmode.factory.CheesePizza;
import com.designmode.factory.Pizza;
import com.designmode.factory.VeggiePizza;

/**
 * @author lqc
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if("cheese".equals(type)){
            return new CheesePizza();
        }else if("veggie".equals(type)){
            return new VeggiePizza();
        } else {
            throw new RuntimeException("没有找到实现类");
        }

    }
}
