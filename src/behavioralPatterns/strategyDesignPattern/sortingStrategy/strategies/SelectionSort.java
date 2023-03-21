package behavioralPatterns.strategyDesignPattern.sortingStrategy.strategies;

public class SelectionSort implements SortStrategy {
    @Override
    public String sort() {
        return "sort using SelectionSort";
    }
}
