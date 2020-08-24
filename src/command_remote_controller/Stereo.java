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
public class Stereo {
    
    String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(place + " Stereo is On");
    }

    public void off() {
        System.out.println(place + " Stereo is Off");
    }

    public void setCd() {
        System.out.println("Stereo is On CD Mode");
    }

    public void setDvd() {
        System.out.println("Stereo is On DVD Mode");
    }

    public void setRadio() {
        System.out.println("Stereo is On Radio Mode");
    }

    public void setVolume(int vol) {
        System.out.println("Volume is set to " + vol);
    }
}
