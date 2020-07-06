/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTheater;

import facade_theater.Amplifier;
import facade_theater.CdPlayer;
import facade_theater.DvdPlayer;
import facade_theater.HomeTheaterFacade;
import facade_theater.PopcornPopper;
import facade_theater.Projector;
import facade_theater.Screen;
import facade_theater.TheaterLights;
import facade_theater.Tuner;

/**
 *
 * @author MRebrov
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater
                = new HomeTheaterFacade(amp,
                        tuner,
                        dvd,
                        cd,
                        projector,
                        lights,
                        screen,
                        popper);
        
        homeTheater.watchMovie("The Lord of the Rings: Fellowship of the Ring");
        homeTheater.endMovie();
    }
}
