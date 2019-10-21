package com.designmode.combination;

import java.util.Iterator;

/**
 * @author lqc
 */
public class Waiterss {

    MenuComponent allMenu;

    public Waiterss(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void menuPrint(){
        allMenu.print();
    }

    public void iterPrint(){
        Iterator<MenuComponent> iterator = allMenu.createIterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            System.out.println(menuComponent.getName());
            menuComponent.print();
        }
    }
}
