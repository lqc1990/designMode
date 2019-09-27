package com.designmode.factory.abstractfactory;

/**
 * @author lqc
 */
public abstract class Pizza {
    String name;
    Cheese cheese;
    Clams clams;
    Dough dough;
    Pepperoni pepperoni;
    Sauce sauce;
    Veggies[] veggies;

    abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350 ");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", clams=" + clams +
                ", dough=" + dough +
                ", pepperoni=" + pepperoni +
                ", sauce=" + sauce +
                '}';
    }
}
