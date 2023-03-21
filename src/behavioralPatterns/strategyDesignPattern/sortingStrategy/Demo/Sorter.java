package behavioralPatterns.strategyDesignPattern.sortingStrategy.Demo;

import behavioralPatterns.strategyDesignPattern.sortingStrategy.strategies.SortStrategy;

public class Sorter {
    SortStrategy sortStrategy;

    Sorter(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void changeStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void executeSortStrategy(){
        System.out.println(sortStrategy.sort());
    }
}
