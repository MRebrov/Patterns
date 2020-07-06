/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_remote_controller;

/**
 *
 * @author MRebrov
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan fan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                fan.high();
                break;
            case CeilingFan.MEDIUM:
                fan.medium();
                break;
            case CeilingFan.LOW:
                fan.low();
                break;
            case CeilingFan.OFF:
                fan.off();
                break;
        }
    }

}
