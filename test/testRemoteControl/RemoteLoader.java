/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testRemoteControl;

import command_remote_controller.Hottub;
import command_remote_controller.TV;
import command_remote_controller.CeilingFan;
import command_remote_controller.CeilingFanOffCommand;
import command_remote_controller.CeilingFanHighCommand;
import command_remote_controller.CeilingFanMediumCommand;
import command_remote_controller.Command;
import command_remote_controller.GarageDoor;
import command_remote_controller.GarageDoorDownCommand;
import command_remote_controller.GarageDoorUpCommand;
import command_remote_controller.HottubOffCommand;
import command_remote_controller.HottubOnCommand;
import command_remote_controller.Light;
import command_remote_controller.LightOffCommand;
import command_remote_controller.LightOnCommand;
import command_remote_controller.MacroCommand;
import command_remote_controller.RemoteControlWithUndo;
import command_remote_controller.Stereo;
import command_remote_controller.StereoOffCommand;
import command_remote_controller.StereoOnWithCDCommand;
import command_remote_controller.TVOffCommand;
import command_remote_controller.TVOnCommand;

/**
 *
 * @author MRebrov
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
        Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

        Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        Command hottubOnCommand = new HottubOnCommand(hottub);
        Command hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {livingRoomLightOff, stereoOff, tvOffCommand, hottubOffCommand};

        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        /*
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);        
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
         */
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("----Pushing Macro On----");
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println("----Pushing Macro Off----");
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
