package creationalPatterns.abstractFactoryDesignPattern.sandwich.bread;

public class WhiteBread implements Bread {
    public String breadDescription(){
        return "white Bread ";
    }

    public int breadCalorie(){
        return 90;
    }
}
