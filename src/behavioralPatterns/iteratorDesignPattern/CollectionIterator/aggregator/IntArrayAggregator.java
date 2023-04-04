package behavioralPatterns.iteratorDesignPattern.CollectionIterator.aggregator;

import behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator.IntArrayIterator;
import behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator.Iterator;

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
