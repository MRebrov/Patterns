/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_remote_controller;

/**
 *
 * @author A702906
 */
public class Light {
    
    String place;

    public Light(String place) {
        this.place = place;
    }
    public void on(){
        System.out.println(place + " Light is On");
    }
    public void off(){
        System.out.println(place + " Light is Off");
    }
}
