package com.gof.decorator;

public class Espresso extends Beverage{
	
	public Espresso(int size){
		this.size = size;
		description = "Espresso";
	}
	@Override
	public double cost() {
		switch (size) {
		case (TALL):
			return 8.0;
		case (GRANDE):
			return 9.0;
		case (VENTI):
			return 10.0;
		default:
			return 0.0;
		}
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
