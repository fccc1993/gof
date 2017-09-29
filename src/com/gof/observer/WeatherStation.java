package com.gof.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);

		weatherData.setMeasurement(84.2, 49.4, 50.6);
		weatherData.setMeasurement(24.4, 75.9, 25.6);
		weatherData.setMeasurement(78.3, 65.8, 53.0);
	}
}
