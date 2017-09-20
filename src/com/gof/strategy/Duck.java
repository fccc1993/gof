package com.gof.strategy;

/**
 * 设计原则 : 
 * 封装变化
 * 多用组合, 少用继承
 * 针对接口编程, 不针对实现编程
 * 
 * 策略模式: 定义了算法族,分别封装, 可以互相替换, 算法与调用者解耦.
 * @author xfc
 *
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void swim(){
		System.out.println("All ducks can swim");
	}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavoir(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
