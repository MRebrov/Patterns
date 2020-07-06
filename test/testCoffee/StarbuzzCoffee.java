/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCoffee;

import decorator_coffee.Beverage;
import decorator_coffee.DarkRoast;
import decorator_coffee.Espresso;
import decorator_coffee.HouseBlend;
import decorator_coffee.Mocha;
import decorator_coffee.Soy;
import decorator_coffee.Whip;

/**
 *
 * @author MRebrov
 */
public class StarbuzzCoffee {
    
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.BIG);
        System.out.println(beverage.getSize() + " " + beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.SMALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getSize() + " " + beverage2.getDescription() + " $" + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.MEDIUM);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getSize() + " " + beverage3.getDescription() + " $" + beverage3.cost());
    }
}
