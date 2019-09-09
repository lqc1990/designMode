package com.designmode.combination;

/**
 * @author lqc
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm ModelDuck");
        performFly();
        performQuack();
    }
}
