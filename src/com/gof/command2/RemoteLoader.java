package com.gof.command2;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		CeilingFan ceilingFan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, lightOn, lightOff);
		remoteControl.setCommand(1, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
	}
}
