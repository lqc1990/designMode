package com.designmode.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lqc
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(Observable observable,Object args) {
        if(observable instanceof ConcreteSubject){
            ConcreteSubject concreteSubject = (ConcreteSubject) observable;
            this.humidity = concreteSubject.getHumidity();
            this.temperature = concreteSubject.getTemperature();
            this.pressure = concreteSubject.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions java"+temperature+","+humidity+","+pressure);
    }
}
