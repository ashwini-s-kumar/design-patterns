package structuralPatterns.decoratorDesignPattern.pizzaDecorator.pizzaTopping.VegTopping;

import structuralPatterns.decoratorDesignPattern.pizzaDecorator.pizza.BasePizza;

public class SeasonalVeg extends BaseVegTopping{
    public SeasonalVeg(BasePizza basePizza) {
        super(basePizza);
        this.cost = 20;
    }

    @Override
    public String getDescription() {

        return basePizza.getDescription() + " , SeasonalVeg ";
    }
}
