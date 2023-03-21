package behavioralPatterns.observerDesignPattern.weatherStation.observable;

import behavioralPatterns.observerDesignPattern.weatherStation.observer.Observer;

public interface Subject {
    void removeObserver(Observer observer);
    void addObserver(Observer observer);
    void notifyAllObservers();

}
