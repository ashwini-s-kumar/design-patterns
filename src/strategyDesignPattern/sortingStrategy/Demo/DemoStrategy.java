package strategyDesignPattern.sortingStrategy.Demo;

import strategyDesignPattern.sortingStrategy.strategies.BubbleSort;
import strategyDesignPattern.sortingStrategy.strategies.MergeSort;
import strategyDesignPattern.sortingStrategy.strategies.SelectionSort;
import strategyDesignPattern.sortingStrategy.strategies.SortStrategy;

public class DemoStrategy {
    public static void main(String [] arr){
        Sorter sorter = new Sorter(new MergeSort());
        System.out.println("Selected SortStartegy : " + sorter.getSortStrategy());
        sorter.executeSortStrategy();

        sorter.changeStrategy(new BubbleSort());
        System.out.println("Selected SortStartegy : " + sorter.getSortStrategy());
        sorter.executeSortStrategy();

        sorter.changeStrategy(new SelectionSort());
        System.out.println("Selected SortStartegy : " + sorter.getSortStrategy());
        sorter.executeSortStrategy();

    }
}
