package com.gof.strategy;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("翅膀飞行");
		
	}
	
}
