package observerDesignPattern.weatherStation;

import observerDesignPattern.weatherStation.observable.WeatherData;
import observerDesignPattern.weatherStation.observer.CurrentForecast;
import observerDesignPattern.weatherStation.observer.CurrentMeasurements;
import observerDesignPattern.weatherStation.observer.CurrentStatistics;

public class WeatherStation {
    public static void main(String [] arr) {
        WeatherData weatherData = new WeatherData();

        new CurrentMeasurements(weatherData);
        new CurrentStatistics(weatherData);
        new CurrentForecast(weatherData);

        System.out.println("The weather changed : ");
        weatherData.setMeasurements(32, 45, 22);

        System.out.println(" =============================================================");
        System.out.println("The weather changed : ");
        weatherData.setMeasurements(40, 32, 17);
    }

}
