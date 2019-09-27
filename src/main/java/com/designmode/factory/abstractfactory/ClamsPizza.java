package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public class ClamsPizza extends Pizza{

    private NYPizzaIngredientFactory factory;

    public ClamsPizza(NYPizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clams = factory.createClams();
    }
}
