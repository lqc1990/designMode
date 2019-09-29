package com.designmode.singleton;

import javax.sound.midi.Soundbank;

/**
 * @author lqc
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for(int i = 0; i <  1_000_000_000; i++){
            Singleton singleton = Singleton.getSingleton();
            System.out.println(singleton.toString());
        }
    }
}
