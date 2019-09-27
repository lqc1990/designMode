package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public class CheesePizza extends Pizza {

    private NYPizzaIngredientFactory factory;

    public CheesePizza(NYPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("NYChess is create");
        cheese = factory.createCheese();
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
