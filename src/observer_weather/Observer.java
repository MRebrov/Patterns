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
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
