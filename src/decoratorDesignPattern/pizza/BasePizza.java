package decoratorDesignPattern.pizza;

public abstract class BasePizza {
    String description = "";
    public double cost;

    public String getDescription()
    {
        return description;
    }

    public double cost()
    {
        return cost;
    }
}
