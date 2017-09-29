package com.gof.decorator;

public class Decaf extends Beverage{
	
	public Decaf(int size){
		this.size = size;
		description = "Decaf";
	}
	@Override
	public double cost() {
		switch (size) {
		case (TALL):
			return 6.0;
		case (GRANDE):
			return 8.0;
		case (VENTI):
			return 10.0;
		default:
			return 0.0;
		}
	}
	@Override
	public int getSize() {
		return size;
	}

}
