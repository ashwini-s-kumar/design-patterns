package behavioralPatterns.iteratorDesignPattern.CollectionIterator;

import behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator.Iterator;
import behavioralPatterns.iteratorDesignPattern.CollectionIterator.aggregator.Aggregator;
import behavioralPatterns.iteratorDesignPattern.CollectionIterator.aggregator.IntArrayAggregator;

public class Demo {
    public static void main(String [] arr){
        int [] array = {20,60,10,80,19,100};

        Aggregator<Integer> intAggregator = new IntArrayAggregator(array);
        Iterator<Integer> interator = intAggregator.createIterator();

        while(interator.hasNext()){
            System.out.println(interator.next() + " ");
        }
    }
}
