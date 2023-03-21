package behavioralPatterns.observerDesignPattern.weatherStation.observable;

import behavioralPatterns.observerDesignPattern.weatherStation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    int temparature, pressure, humidity;
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    void measurementsChanged(){
        notifyAllObservers();
    }

    public void setMeasurements(int temparature, int pressure, int humidity){
        this.temparature = temparature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public int getTemparature() {
        return temparature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temparature=" + temparature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
