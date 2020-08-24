/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPizza;

import factory_method_abstract_factory_pizza.chicago.ChicagoPizzaStore;
import factory_method_abstract_factory_pizza.ny.NYPizzaStore;
import factory_method_abstract_factory_pizza.Pizza;
import factory_method_abstract_factory_pizza.PizzaStore;

/**
 *
 * @author A702906
 */
public class PizzaTestDrive {
    
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
    
}
