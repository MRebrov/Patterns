/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_remote_controller;

/**
 *
 * @author MRebrov
 */
public class TV {

    String location;

    public TV(String place) {
        location = place;
    }

    public void on() {
        System.out.println(location + "TV is on");
    }

    public void off() {
        System.out.println(location + "TV is off");
    }
}
