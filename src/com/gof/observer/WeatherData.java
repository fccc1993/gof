package com.gof.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer o = (Observer) observers.get(i);
			o.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementChanged(){
		notifyObservers();
	}
	
	public void setMeasurement(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
				
	}
	
}
