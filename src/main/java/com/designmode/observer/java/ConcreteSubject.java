package com.designmode.observer.java;

import java.util.Observable;

/**
 * @author lqc
 */
public class ConcreteSubject extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void  setMeasurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure =pressure;
        setMeasurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }


    public float getPressure() {
        return pressure;
    }

}
