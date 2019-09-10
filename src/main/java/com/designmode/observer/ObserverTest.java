package com.designmode.observer;

/**
 * @author lqc
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(concreteSubject);
        concreteSubject.setMeasurements(1.1f,1.2f,1.3f);
    }
}
