package structuralPatterns.decoratorDesignPattern.pizzaTopping.VegTopping;

import structuralPatterns.decoratorDesignPattern.pizza.BasePizza;
import structuralPatterns.decoratorDesignPattern.pizzaTopping.BasePizzaDecorator;

public abstract class BaseVegTopping extends BasePizzaDecorator {
    BasePizza basePizza ;
    BaseVegTopping(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription();
    }

    @Override
    public double cost()
    {
        return this.basePizza.cost() + this.cost;
    }
}
