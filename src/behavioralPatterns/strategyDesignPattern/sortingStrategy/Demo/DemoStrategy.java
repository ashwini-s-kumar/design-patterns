package behavioralPatterns.strategyDesignPattern.sortingStrategy.Demo;

import behavioralPatterns.strategyDesignPattern.sortingStrategy.strategies.BubbleSort;
import behavioralPatterns.strategyDesignPattern.sortingStrategy.strategies.MergeSort;
import behavioralPatterns.strategyDesignPattern.sortingStrategy.strategies.SelectionSort;

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
