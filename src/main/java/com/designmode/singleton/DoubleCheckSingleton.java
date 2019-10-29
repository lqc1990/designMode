package com.designmode.singleton;

/**
 * @author lqc
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton =  new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
