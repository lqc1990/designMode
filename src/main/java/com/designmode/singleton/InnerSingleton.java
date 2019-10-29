package com.designmode.singleton;

/**
 * @author lqc
 * 通过静态内部类初始化主类
 */
public class InnerSingleton {

    private InnerSingleton(){
    }

    private final static class Inner{
        private final static InnerSingleton INNER_SINGLETON = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return Inner.INNER_SINGLETON;
    }

}
