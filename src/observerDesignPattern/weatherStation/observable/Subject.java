package observerDesignPattern.weatherStation.observable;

import observerDesignPattern.weatherStation.observer.Observer;

public interface Subject {
    void removeObserver(Observer observer);
    void addObserver(Observer observer);
    void notifyAllObservers();

}
