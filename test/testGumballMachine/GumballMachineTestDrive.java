/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testGumballMachine;

import java.rmi.RemoteException;
import state_proxy_mighty_gumballs.GumballMachine;
import state_proxy_mighty_gumballs.GumballMonitor;

/**
 *
 * @author A702906
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
        
        int count = 0;
        
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        
        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
                
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        gumballMachine.refill(5);
        
        System.out.println(gumballMachine);
        
        gumballMonitor.report();
    }
}
