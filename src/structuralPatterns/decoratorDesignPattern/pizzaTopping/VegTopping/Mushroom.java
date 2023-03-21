package structuralPatterns.decoratorDesignPattern.pizzaTopping.VegTopping;

import structuralPatterns.decoratorDesignPattern.pizza.BasePizza;

public class Mushroom extends BaseVegTopping {
    public Mushroom(BasePizza basePizza)
    {
        super(basePizza);
        this.cost = 50;
    }

    @Override
    public String getDescription()
    {
        return this.basePizza.getDescription() + ", Mushroom ";
    }
}
