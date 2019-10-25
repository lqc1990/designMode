package com.designmode.porxy;

import java.rmi.Remote;

/**
 * @author lqc
 */
public class MyRemote implements Remote {

    public String sayHello(String name) throws RuntimeException{
        return "Hi,"+name;
    }
}
