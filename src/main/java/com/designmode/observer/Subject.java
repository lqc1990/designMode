package com.designmode.observer;

/**
 * @author lqc
 */
public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void obsNotify();
}
