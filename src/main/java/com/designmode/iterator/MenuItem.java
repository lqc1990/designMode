package com.designmode.iterator;

import java.math.BigDecimal;

/**
 * @author lqc
 */
public class MenuItem {

    private String name;
    private String describe;
    private boolean vegetarian;
    private BigDecimal price;

    public MenuItem(String name, String describe, boolean vegetarian, BigDecimal price) {
        this.name = name;
        this.describe = describe;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
