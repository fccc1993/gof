package com.gof.command;

public class SingleRemoteControl {
	Command slot;

	public SingleRemoteControl() {
	}

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
