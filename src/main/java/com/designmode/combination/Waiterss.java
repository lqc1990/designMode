package com.designmode.combination;

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
}
