/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza.chicago;

import factory_method_abstract_factory_pizza.CheesePizza;
import factory_method_abstract_factory_pizza.ClamPizza;
import factory_method_abstract_factory_pizza.PepperoniPizza;
import factory_method_abstract_factory_pizza.Pizza;
import factory_method_abstract_factory_pizza.PizzaIngredientFactory;
import factory_method_abstract_factory_pizza.PizzaStore;
import factory_method_abstract_factory_pizza.VeggiePizza;
import factory_method_abstract_factory_pizza.ny.NYPizzaIngredientFactory;

/**
 *
 * @author A702906
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else {
            throw new RuntimeException("Unsupported pizza");
        }
        return pizza;
    }
}
