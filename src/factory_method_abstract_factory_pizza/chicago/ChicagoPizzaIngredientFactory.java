/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza.chicago;

import factory_method_abstract_factory_pizza.ingredients.veggies.Spinach;
import factory_method_abstract_factory_pizza.ingredients.veggies.EggPlant;
import factory_method_abstract_factory_pizza.ingredients.veggies.BlackOlives;
import factory_method_abstract_factory_pizza.ingredients.FrozenClams;
import factory_method_abstract_factory_pizza.ingredients.SlicedPepperoni;
import factory_method_abstract_factory_pizza.ingredients.Mozzarella;
import factory_method_abstract_factory_pizza.ingredients.PlumTomatoSauce;
import factory_method_abstract_factory_pizza.ingredients.ThickCrustDough;
import factory_method_abstract_factory_pizza.PizzaIngredientFactory;
import factory_method_abstract_factory_pizza.ingredients.Cheese;
import factory_method_abstract_factory_pizza.ingredients.Clam;
import factory_method_abstract_factory_pizza.ingredients.Dough;
import factory_method_abstract_factory_pizza.ingredients.Pepperoni;
import factory_method_abstract_factory_pizza.ingredients.Sauce;
import factory_method_abstract_factory_pizza.ingredients.Veggies;
/**
 *
 * @author MRebrov
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }   
}
