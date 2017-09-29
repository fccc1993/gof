package com.gof.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SingleRemoteControl remote = new SingleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
		remote.setCommand(doorOpen);
		remote.buttonWasPressed();

	}
}
