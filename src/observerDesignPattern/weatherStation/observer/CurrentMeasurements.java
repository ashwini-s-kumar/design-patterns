package observerDesignPattern.weatherStation.observer;

import observerDesignPattern.weatherStation.observable.WeatherData;

public class CurrentMeasurements implements Observer, Display{
    WeatherData weatherData;
    public CurrentMeasurements(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }
    @Override
    public void display() {
        System.out.println("Current Measurements : " + weatherData.toString());
    }
}
