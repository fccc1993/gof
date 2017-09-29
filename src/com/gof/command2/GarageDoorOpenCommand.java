package com.gof.command2;

public class GarageDoorOpenCommand implements Command{
	
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.openDoor();
	}
	@Override
	public void undo() {
		garageDoor.closeDoor();
	}

}
