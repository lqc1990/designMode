package com.designmode.combination;

import java.math.BigDecimal;

/**
 * @author lqc
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String describe;
    private BigDecimal price;
    private boolean vegetarian;

    public MenuItem(String name, String describe, BigDecimal price, boolean vegetarian) {
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(","+getPrice());
        System.out.println("  --"+getDescribe());
    }
}
