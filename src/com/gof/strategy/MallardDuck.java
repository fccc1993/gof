package com.gof.strategy;

public class MallardDuck extends Duck {
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I am a MallardDuck");
	}
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}
