package behavioralPatterns.iteratorDesignPattern.CollectionIterator.Iterator;

public class IntArrayIterator implements Iterator{
    int [] arr;
    int currentIndex;

    public IntArrayIterator(int[] arr) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < arr.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            int currentInt = this.arr[currentIndex];
            currentIndex ++ ;
            return currentInt;
        }
        return  null;
    }
}
