package com.designmode.observer.java;

/**
 * @author lqc
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(concreteSubject);
        concreteSubject.setMeasurements(1.1f,1.2f,1.3f);
        concreteSubject.setMeasurements(2.1f,2.2f,2.3f);
        concreteSubject.setMeasurements(3.1f,3.2f,3.3f);

    }
}
