package com.designmode.singleton;

import javax.sound.midi.Soundbank;

/**
 * @author lqc
 */
public class SingletonThread implements Runnable{

    @Override
    public void run() {
        InnerSingleton innerSingleton = InnerSingleton.getInstance();
        System.out.println(innerSingleton.toString());
    }
}
