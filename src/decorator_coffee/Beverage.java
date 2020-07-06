/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_coffee;

/**
 *
 * @author MRebrov
 */
public abstract class Beverage {
    public enum Size {BIG, SMALL, MEDIUM}
    
    String description = "Unknown Beverage";
    Size size;
    
    public String getDescription() {
        return description;
    }
    
    public void setSize(Size size) {
        this.size = size;
    }
    
    public Size getSize() {
        return this.size;
    }
    
    public abstract double cost();
}
