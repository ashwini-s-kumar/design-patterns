package behavioralPatterns.iteratorDesignPattern.collectionIterator.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
