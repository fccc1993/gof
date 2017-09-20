package com.gof.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
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
		System.out.println("temperature is " + temperature +
				" F degree, humidity is " +humidity +"% humidity" );
	}
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurement(84.2, 49.4, 50.6);
		weatherData.setMeasurement(24.4, 75.9, 67.9);
		weatherData.setMeasurement(78.3, 65.8, 53.0);
	}
	
}
