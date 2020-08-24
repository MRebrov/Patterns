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
public class Singleton {
    
    private static Singleton uniqueInstance;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance =  new Singleton();
        }
        return uniqueInstance;
    }
    
}
