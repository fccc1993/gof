package com.gof.command2;

public class Stereo {
	public void on() {
		System.out.println("Stereo On !");
	}

	public void off() {
		System.out.println("Stereo Off !");
	}

	public void setCD() {
		System.out.println("Set CD My Love !");
	}

	public void setVolume(int volume) {
		System.out.println("Set Volume " + volume);
	}
}
