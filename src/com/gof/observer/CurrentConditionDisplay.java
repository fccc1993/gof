package com.gof.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		//观察者注册主题, 以便在主题数据改变时能够收到更新.
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature +
				" F degree, " +humidity +"% humidity" );
	}
	
	
}
