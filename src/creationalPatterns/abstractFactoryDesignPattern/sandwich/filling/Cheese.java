package creationalPatterns.abstractFactoryDesignPattern.sandwich.filling;

public class Cheese implements Filling {
    public String description(){
        return "Cheese filling ";
    }
    public int calorie(){
        return 150;
    }
}
