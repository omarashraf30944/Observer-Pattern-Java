/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.observer;

/**
 *
 * @author omar
 */
public class CurrentConditionsDisplay implements iDisplayElement,iObserver {
    
    private float temprature;
    private WeatherData weatherData;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temprature + " F degrees and"
                + humidity + " % humidity");
    }

    @Override
    public void update() {
        this.temprature = weatherData.getTemprature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    
    
}
