/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza.ny;

import factory_method_abstract_factory_pizza.ingredients.FreshClams;
import factory_method_abstract_factory_pizza.ingredients.SlicedPepperoni;
import factory_method_abstract_factory_pizza.ingredients.Cheese;
import factory_method_abstract_factory_pizza.ingredients.Clam;
import factory_method_abstract_factory_pizza.ingredients.Dough;
import factory_method_abstract_factory_pizza.ingredients.veggies.Garlic;
import factory_method_abstract_factory_pizza.ingredients.MarinaraSauce;
import factory_method_abstract_factory_pizza.ingredients.veggies.Mushroom;
import factory_method_abstract_factory_pizza.ingredients.veggies.Onion;
import factory_method_abstract_factory_pizza.ingredients.Pepperoni;
import factory_method_abstract_factory_pizza.PizzaIngredientFactory;
import factory_method_abstract_factory_pizza.ingredients.veggies.RedPepper;
import factory_method_abstract_factory_pizza.ingredients.ReggianoCheese;
import factory_method_abstract_factory_pizza.ingredients.Sauce;
import factory_method_abstract_factory_pizza.ingredients.ThinCrustDough;
import factory_method_abstract_factory_pizza.ingredients.Veggies;

/**
 *
 * @author MRebrov
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }
    
}
