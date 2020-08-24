/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_theater;

/**
 *
 * @author A702906
 */
public class Amplifier {

    void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers 1 subwoofer)");
    }

    void setVolume(int i) {
        System.out.println("Top-O-Line Amplifier setting volume to " + i);
    }

    void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
    
}
