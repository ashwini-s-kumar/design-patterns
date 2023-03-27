package structuralPatterns.decoratorDesignPattern.pizzaDecorator.pizzaTopping.ChickenTopping;

import structuralPatterns.decoratorDesignPattern.pizzaDecorator.pizza.BasePizza;
import structuralPatterns.decoratorDesignPattern.pizzaDecorator.pizzaTopping.BasePizzaDecorator;

public class BaseChickenTopping extends BasePizzaDecorator {

    BasePizza basePizza;

    BaseChickenTopping(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription()
    {
        return this.basePizza.getDescription() + ", Chicken ";
    }

    @Override
    public double cost()
    {
        return this.basePizza.cost() + this.cost;
    }

}
