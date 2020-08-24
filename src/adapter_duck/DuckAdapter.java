/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_duck;

/**
 *
 * @author A702906
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    
    @Override
    public void gobble() {
        duck.quack();
    }
    
    @Override
    public void fly() {
        System.out.println("I'll land where the Turkey lands");
        duck.fly();
    }
    
}
