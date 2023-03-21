package creationalPatterns.abstractFactoryDesignPattern.sandwich.filling;

public class Egg implements Filling {
    public String description(){
        return "Egg filling ";
    }
    public int calorie(){
        return 100;
    }
}
