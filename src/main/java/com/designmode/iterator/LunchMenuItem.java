package com.designmode.iterator;

import java.math.BigDecimal;

/**
 * @author lqc
 */
public class LunchMenuItem {

    private static final int MAX_LENGTH = 2;
    private int index = 0;
    private MenuItem[] menuItems = new MenuItem[2];

    public LunchMenuItem() {
        addItem("宫保鸡丁","鸡丁，洋葱",false,new BigDecimal(30));
        addItem("苜蓿肉","猪肉,木耳,鸡蛋,苜蓿",false,new BigDecimal(30));
    }

    public void addItem(String name, String describe, boolean vegetarian, BigDecimal price){
        if(index > MAX_LENGTH){
            System.out.println("菜单种类超出限制");
        } else {
            menuItems[index] = new MenuItem(name,describe,vegetarian,price);
            index++;
        }
    }

    public LunchMenuIter createArrIter(){
        return new LunchMenuIter(menuItems);
    }
}
