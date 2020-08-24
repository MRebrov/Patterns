/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_proxy_mighty_gumballs;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author A702906
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;
    private String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        this.location = location;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();    
    } 

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }     
    
    void setState(State state) {
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }
    
    public State getNoQuarterState() {
        return noQuarterState;
    }
    
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
    public State getSoldState() {
        return soldState;
    }
    
    public State getWinnerState() {
        return winnerState;
    }
    
    public int getCount() {
        return count;
    }
    
    public void refill(int numberOfBalls) {
        if (numberOfBalls > 0) {
            count+= numberOfBalls;
            state = noQuarterState;
        }
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\n"
                + "Java-enabled Standing Gumball Model #2004\n"
                + "Inventory: " + count + " gumballs\n"
                + "Machine is waiting for quarter\n";        
    }
    
    
}
