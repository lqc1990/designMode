package com.designmode.decorate;

/**
 * @author lqc
 */
public class BeverageTest {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();

        Beverage beverage1 = new Mocha(beverage);
        Beverage beverage2 = new Whip(beverage1);

        System.out.println(beverage2.getDescribe()+" \n"+beverage2.cost());
    }
}
