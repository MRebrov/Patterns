/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_proxy_mighty_gumballs;

import java.io.Serializable;

/**
 *
 * @author A702906
 */
public interface State extends Serializable {
    
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    
}
