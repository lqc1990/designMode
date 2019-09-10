package com.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lqc
 */
public class ConcreteSubject implements Subject{

    private  List<Observer> list;
    private float temperature;
    private float humidity;
    private float pressure;

    public ConcreteSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
       int index =  list.indexOf(observer);
       list.remove(index);
    }

    @Override
    public void obsNotify() {
        for(Observer obj : list){
            obj.update(temperature,humidity,pressure);
        }
    }

    public void setChange(){
        obsNotify();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure =pressure;
        setChange();
    }
}
