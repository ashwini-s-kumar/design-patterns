package observerDesignPattern.weatherStation.observer;

import observerDesignPattern.weatherStation.WeatherStation;
import observerDesignPattern.weatherStation.observable.Subject;
import observerDesignPattern.weatherStation.observable.WeatherData;

public class CurrentStatistics implements Observer, Display{

    int lastTemp = 0 , currentTemp = 27;
    WeatherData weatherData;
    public CurrentStatistics(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update( WeatherData weatherData) {
        this.weatherData = weatherData;
        lastTemp = currentTemp;
        currentTemp = weatherData.getTemparature();
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentStatistics : lastTemp :" + lastTemp + " ,currentTemp :"
                + currentTemp + " ,average :"+ ((lastTemp + currentTemp)/2));
    }
}
