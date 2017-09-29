package com.gof.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double temperature;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		display();

	}

}
