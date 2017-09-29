package com.gof.decorator;

public class DarkRoast extends Beverage {
	public DarkRoast(int size) {
		this.size = size;
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		switch (size) {
		case (TALL):
			return 8.0;
		case (GRANDE):
			return 10.0;
		case (VENTI):
			return 12.0;
		default:
			return 0.0;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

}
