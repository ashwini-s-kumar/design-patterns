package structuralPatterns.decoratorDesignPattern.pizzaTopping.ChickenTopping;

import structuralPatterns.decoratorDesignPattern.pizza.BasePizza;

public class Pepperoni extends BaseChickenTopping {

    public Pepperoni(BasePizza basePizza)
    {
        super(basePizza);
        this.cost = 40;
    }

    @Override
    public String getDescription()
    {
        return this.basePizza.getDescription() + " , Pepperoni ";
    }
}
