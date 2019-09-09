package com.designmode.combination;

/**
 * @author lqc
 */
public class Mallard extends Duck{

    public Mallard() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        performQuack();
        performFly();
    }
}
