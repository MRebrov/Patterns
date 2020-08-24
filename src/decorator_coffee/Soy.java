/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_coffee;

/**
 *
 * @author A702906
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (getSize()) {
            case SMALL:
                cost = .15 + beverage.cost();
                break;
            case MEDIUM:
                cost = .20 + beverage.cost();
                break;
            case BIG:
                cost = .25 + beverage.cost();
                break;
        }
        return cost;
    }

}
