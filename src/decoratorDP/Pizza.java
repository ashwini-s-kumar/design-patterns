package decoratorDP;

import decoratorDP.pizza.BasePizza;
import decoratorDP.pizza.ChickenPizza;
import decoratorDP.pizza.VegPizza;
import decoratorDP.pizzaTopping.ChickenTopping.Pepperoni;
import decoratorDP.pizzaTopping.VegTopping.Mushroom;
import decoratorDP.pizzaTopping.VegTopping.SeasonalVeg;

public class Pizza {
    public static void main(String [] arr)
    {
        // Create first Pizza

        BasePizza pizza1 = new VegPizza();
        System.out.println( pizza1.getDescription() + " : $" + pizza1.cost());

        // Now we add some Topping
        pizza1 = new SeasonalVeg(pizza1);
        System.out.println( pizza1.getDescription() + " : $ " + pizza1.cost());

        pizza1 = new Mushroom(pizza1);
        System.out.println( pizza1.getDescription() + " : $ " + pizza1.cost());

        // Create second Pizza : NON- Veg

        BasePizza pizza2 = new ChickenPizza();
        pizza2 = new Mushroom(pizza2);
        pizza2 = new Pepperoni(pizza2);

        System.out.println( pizza2.getDescription() + " : $ " + pizza2.cost());

    }
}
