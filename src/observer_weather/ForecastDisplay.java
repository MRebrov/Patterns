/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_weather;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author A702906
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    
    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
    
    @Override
    public void display() {
        System.out.println("Forecast: lastPressure - " + lastPressure + " currentPressure - " + currentPressure);
    }
}
