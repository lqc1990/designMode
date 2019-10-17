package com.designmode.iterator;

/**
 * @author lqc
 */
public class MenuTest {

    public static void main(String[] args) {

        LunchMenuItem lunchMenu = new LunchMenuItem();
        BreakfastMenuItem breakfastMenuItem = new BreakfastMenuItem();

        Waitress waitress = new Waitress(lunchMenu,breakfastMenuItem);

        waitress.printMenu();
    }
}
