/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_proxy_mighty_gumballs;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author A702906
 */
public interface MyRemote extends Remote {
    
    public String  sayHello() throws RemoteException;
    
}
