/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_theater;

/**
 *
 * @author MRebrov
 */
public class DvdPlayer {
    
    String movie;

    void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    void play(String movie) {
        this.movie = movie;
        System.out.println("Top-O-Line DVD Player playing \"" + this.movie + "\"");
    }

    void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"" + movie + "\"");
    }

    void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
    
}
