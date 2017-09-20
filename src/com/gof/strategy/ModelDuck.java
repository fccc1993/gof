package com.gof.strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("i am a model duck");
	}
	
	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavoir(new FlyRocketPowered());
		model.performFly();
	}

}
