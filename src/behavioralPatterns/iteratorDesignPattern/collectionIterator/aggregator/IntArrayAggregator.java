package behavioralPatterns.iteratorDesignPattern.collectionIterator.aggregator;

import behavioralPatterns.iteratorDesignPattern.collectionIterator.Iterator.IntArrayIterator;
import behavioralPatterns.iteratorDesignPattern.collectionIterator.Iterator.Iterator;

public class IntArrayAggregator implements Aggregator{
    int [] arr;

    public IntArrayAggregator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator createIterator() {
        return new IntArrayIterator(this.arr);
    }
}
