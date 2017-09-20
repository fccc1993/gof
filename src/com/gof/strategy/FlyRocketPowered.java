package com.gof.strategy;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i can fly with a rocket");
	}

}
