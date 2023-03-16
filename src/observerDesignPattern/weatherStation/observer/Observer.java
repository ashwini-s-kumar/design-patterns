package observerDesignPattern.weatherStation.observer;

import observerDesignPattern.weatherStation.observable.Subject;
import observerDesignPattern.weatherStation.observable.WeatherData;

public interface Observer {
    void update(WeatherData weatherData);
}
