package com.gof.decorator;

public abstract class Beverage {
	public static final int TALL = 1;
	public static final int GRANDE = 2;
	public static final int VENTI = 3;
	int size;
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract int getSize();
		

	public abstract double cost();
}
