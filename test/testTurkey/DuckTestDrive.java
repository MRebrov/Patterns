/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTurkey;

import adapter_duck.MallardDuck;
import adapter_duck.Duck;
import adapter_duck.DuckAdapter;
import adapter_duck.Turkey;
import adapter_duck.TurkeyAdapter;
import adapter_duck.WildTurkey;

/**
 *
 * @author A702906
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        Turkey duckAdapter = new DuckAdapter(mallardDuck);
        
        System.out.println("The Turkey says...");
        testTurkey(wildTurkey);
        
        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);
        
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        
        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
        
    }
    
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
    
    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

}
