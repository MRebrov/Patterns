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
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clam createClam();
}
