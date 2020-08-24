/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_chocolate_boiler;

/**
 *
 * @author A702906
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler boiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getBoiler() {
        if (boiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (boiler == null) {
                    boiler = new ChocolateBoiler();
                }
            }
        }
        return boiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //filling with milk and chocolate
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drain heaten chocolate and milk
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //boiling
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
