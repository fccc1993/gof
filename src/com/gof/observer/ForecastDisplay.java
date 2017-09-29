package com.gof.observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private double pressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.pressure = pressure;
		display();

	}

	@Override
	public void display() {
		if (pressure >= 30) {
			System.out.println("Forecast: Improving weather on the way!");
		} else {
			System.out.println("Forecast: Watch out for cooler, rainy weather!");
		}
	}

}
