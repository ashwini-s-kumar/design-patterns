package behavioralPatterns.iteratorDesignPattern.CollectionIterator.aggregator;

import behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
