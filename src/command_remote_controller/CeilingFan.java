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
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    String location;

    public CeilingFan(String place) {
        this.location = place;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " Ceiling Fan is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Ceiling Fan is low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " Ceiling Fan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
