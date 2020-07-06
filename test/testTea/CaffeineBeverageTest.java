/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTea;

import template_method_tea.CaffeineBeverageWithHook;
import template_method_tea.CoffeeWithHook;
import template_method_tea.TeaWithHook;

/**
 *
 * @author MRebrov
 */
public class CaffeineBeverageTest {
    
    public static void main(String[] args) {
    
        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();
        
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
        
    }
    
}
