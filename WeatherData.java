/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omar
 */
public class WeatherData implements iSubject {
    
    private List<iObserver> observers;
    private float temprature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(iObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(iObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(iObserver observer : observers){
            observer.update();
        }
    }
    
    public void measurmentsChanged(){
        notifyObserver();
    }
    
    public void setMeasurements(float temprature,float humidity,float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }

    public float getTemprature() {
        return temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
    
    
}
