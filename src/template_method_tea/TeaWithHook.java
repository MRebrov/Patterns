/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_method_tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author A702906
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;            
        }
        return false;
    }
    
    private String getUserInput() {
        String answer = null;
        
        System.out.print("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch(IOException ex) {
            System.out.println("IO exception trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }        
        return answer;
    }

}
