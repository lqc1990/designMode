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

    public void menuPrint() {
        allMenu.print();
    }

    public void iterPrint() {
        Iterator<MenuComponent> iterator = allMenu.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    System.out.println(menuComponent.getName());
                }
            } catch (UnsupportedOperationException e){
                //只有菜单项才实现了isVegetarian() 子元素没有实现，所以抛出异常继续执行循环
            }
        }
    }
}
