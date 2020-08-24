/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_proxy_mighty_gumballs;

import java.rmi.Naming;

/**
 *
 * @author A702906
 */
public class GumballMonitorTest {
    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://DESKTOP-NE4FNHR/gumballmachine");
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachineRemote);
            gumballMonitor.report();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
