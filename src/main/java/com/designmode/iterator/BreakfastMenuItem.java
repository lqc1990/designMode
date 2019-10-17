package com.designmode.iterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lqc
 */
public class BreakfastMenuItem {

    private List<MenuItem> menuItems = new ArrayList<>();

    public BreakfastMenuItem() {
        addMenuItem("煎饼","薄饼,鸡蛋,火腿",false,new BigDecimal(10));
        addMenuItem("皮蛋瘦肉粥","水，大米，瘦肉",false,new BigDecimal(5));
    }

    public void addMenuItem(String name,String describe,boolean vegetarian,BigDecimal price){
        MenuItem menuItem = new MenuItem(name,describe,vegetarian,price);
        menuItems.add(menuItem);
    }

    public BreakfastMenuIter createIter(){
        return new BreakfastMenuIter(menuItems);
    }

}
