package behavioralPatterns.iteratorDesignPattern.collectionIterator.aggregator;

import behavioralPatterns.iteratorDesignPattern.collectionIterator.Iterator.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
