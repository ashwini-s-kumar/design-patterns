package abstractFactoryDesignPattern.sandwich.bread;

public class BrownBread implements Bread {
    public String breadDescription(){
        return "Brown Bread ";
    }

    public int breadCalorie(){
        return 60;
    }
}
