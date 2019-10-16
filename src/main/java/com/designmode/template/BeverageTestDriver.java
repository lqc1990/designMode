package com.designmode.template;

/**
 * @author lqc
 */
public class BeverageTestDriver {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
