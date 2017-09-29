package com.gof.decorator;

public class HouseBlend extends Beverage{
	public HouseBlend(int size){
		this.size = size;
		description = "HouseBlend";
	}
	@Override
	public double cost() {
		switch (size) {
		case (TALL):
			return 10.0;
		case (GRANDE):
			return 11.0;
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
