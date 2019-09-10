package com.designmode.observer;

/**
 * @author lqc
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private ConcreteSubject concreteSubject;

    public CurrentConditionsDisplay(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.register(this);
    }

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions "+temperature+","+humidity+","+pressure);
    }
}
