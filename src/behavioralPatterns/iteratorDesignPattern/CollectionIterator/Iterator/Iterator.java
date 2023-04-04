package behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
