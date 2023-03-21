package behavioralPatterns.observerDesignPattern.weatherStation.observer;

import behavioralPatterns.observerDesignPattern.weatherStation.observable.WeatherData;

public interface Observer {
    void update(WeatherData weatherData);
}
