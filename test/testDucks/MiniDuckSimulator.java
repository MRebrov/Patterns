/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDucks;

import strategy_ducks.Duck;
import strategy_ducks.FlyRocketPowered;
import strategy_ducks.MallardDuck;
import strategy_ducks.ModelDuck;

/**
 *
 * @author A702906
 */
public class MiniDuckSimulator {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
