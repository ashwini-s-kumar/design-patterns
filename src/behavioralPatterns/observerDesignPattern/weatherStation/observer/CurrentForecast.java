package behavioralPatterns.observerDesignPattern.weatherStation.observer;

import behavioralPatterns.observerDesignPattern.weatherStation.observable.WeatherData;

public class CurrentForecast implements Observer, Display{
    int lastPressure = 0, currentPressure = 12;
    WeatherData weatherData;

    public CurrentForecast(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.print("CurrentForecast : ");
        if(currentPressure > lastPressure){
            System.out.println("Weather is improving");
        }
        else{
            System.out.println("Weather is getting bad");
        }
    }
}
