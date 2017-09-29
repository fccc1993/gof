package com.gof.decorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch (getSize()) {
		case (TALL):
			cost += 1.0;
		case (GRANDE):
			cost += 2.0;
		case (VENTI):
			cost += 3.0;
		default:
			cost += 0.0;
		}
		return cost;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
