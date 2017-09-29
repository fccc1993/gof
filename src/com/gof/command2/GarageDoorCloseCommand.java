package com.gof.command2;

public class GarageDoorCloseCommand implements Command {

	private GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.closeDoor();
	}

	@Override
	public void undo() {
		garageDoor.openDoor();
	}
}
