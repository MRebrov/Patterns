/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_weather;

/**
 *
 * @author A702906
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + calculateHeatIndex(temperature, humidity));
    }
    
    private double calculateHeatIndex ( float currentTemp, float currentHumidity ) {
        final double C1 = -42.379;
        final double C2 = 2.04901523;
        final double C3 = 10.14333127;
        final double C4 = -0.22475541;
        final double C5 = -.00683783;
        final double C6 = -5.481717E-2;
        final double C7 = 1.22874E-3;
        final double C8 = 8.5282E-4;
        final double C9 = -1.99E-6;
        float T = currentTemp;
        float R = currentHumidity;
        float T2 = currentTemp * currentTemp;
        float R2 = currentHumidity * currentHumidity;

        //Function of Calculating Heat Index
        return C1 + (C2 * T) + (C3 * R) + (C4 * T * R) + (C5 * T2) + (C6 * R2) + (C7 * T2 * R) + (C8 * T * R2) + (C9 * T2 * R2);
    }
    
}
