/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method_abstract_factory_pizza.california;

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
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sauce createSauce() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cheese createCheese() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veggies[] createVeggies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pepperoni createPepperoni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clam createClam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
