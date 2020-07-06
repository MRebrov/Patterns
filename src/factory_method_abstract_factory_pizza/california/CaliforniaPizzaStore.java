/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza.california;

import factory_method_abstract_factory_pizza.CheesePizza;
import factory_method_abstract_factory_pizza.ClamPizza;
import factory_method_abstract_factory_pizza.PepperoniPizza;
import factory_method_abstract_factory_pizza.Pizza;
import factory_method_abstract_factory_pizza.PizzaStore;
import factory_method_abstract_factory_pizza.VeggiePizza;

/**
 *
 * @author MRebrov
 */
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        CaliforniaPizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        } else {
            throw new RuntimeException("Unsupported pizza");
        }
        return pizza;
    }
    
}
