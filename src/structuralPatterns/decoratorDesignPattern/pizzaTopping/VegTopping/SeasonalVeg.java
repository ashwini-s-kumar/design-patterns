package structuralPatterns.decoratorDesignPattern.pizzaTopping.VegTopping;

import structuralPatterns.decoratorDesignPattern.pizza.BasePizza;

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
