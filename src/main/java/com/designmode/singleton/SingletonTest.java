package com.designmode.singleton;

/**
 * @author lqc
 */
public class SingletonTest {

    public static void main(String[] args) {
        SingletonThread singletonThread = new SingletonThread();
        Thread t1 = new Thread(singletonThread);
        Thread t2 = new Thread(singletonThread);
        t1.start();
        t2.start();
        System.out.println("线程结束");
    }
}
