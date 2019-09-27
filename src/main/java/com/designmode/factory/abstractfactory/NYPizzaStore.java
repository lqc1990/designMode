package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        if("cheese".equals(item)){
            pizza =  new CheesePizza(factory);
            pizza.setName("NYStyle chess pizza");
        }
        if("clams".equals(item)){
            pizza = new ClamsPizza(factory);
            pizza.setName("clamsStyle pizza");
        }
        return pizza;
    }
}
