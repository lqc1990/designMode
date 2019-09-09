package com.designmode.combination;

/**
 * @author lqc
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack,quack,quack");
    }
}
