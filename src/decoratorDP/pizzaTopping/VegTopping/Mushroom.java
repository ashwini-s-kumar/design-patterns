package decoratorDP.pizzaTopping.VegTopping;

import decoratorDP.pizza.BasePizza;

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
