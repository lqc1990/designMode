package com.designmode.combination;

/**
 * @author lqc
 * 组合
 * 在不改变类行为的情况下，通过注册接口，改变接口的实现来完成不同的行为。
 */
public class DuckTest {

    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        mallard.dispaly();
        System.out.println("--------------------------");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.dispaly();
        System.out.println("--------------------------");
        //通过修改接口实现类来改变用户的行为。
        FlyBehavior flyBehavior = new FlyRocketPowered();
        modelDuck.setFlyBehavior(flyBehavior);
        modelDuck.dispaly();

    }
}
