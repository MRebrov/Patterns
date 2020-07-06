/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_weather;

/**
 *
 * @author MRebrov
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float oldTemperature;
    private float humidity;
    private float oldHumidity;
    private float pressure;
    private float oldPressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        oldTemperature = this.temperature;
        this.temperature = temperature;
        oldHumidity = this.humidity;
        this.humidity = humidity;
        oldPressure = this.pressure;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature changed: " + (temperature - oldTemperature) + "C degrees");
        System.out.println("Humidity changed: " + (humidity - oldHumidity) + "%");
        System.out.println("Pressure changed: " + (pressure - oldPressure) + "mm");
    }

}
