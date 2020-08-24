/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza;

import factory_method_abstract_factory_pizza.ingredients.Cheese;
import factory_method_abstract_factory_pizza.ingredients.Clam;
import factory_method_abstract_factory_pizza.ingredients.Dough;
import factory_method_abstract_factory_pizza.ingredients.Pepperoni;
import factory_method_abstract_factory_pizza.ingredients.Sauce;
import factory_method_abstract_factory_pizza.ingredients.Veggies;

/**
 *
 * @author A702906
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;   

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}
