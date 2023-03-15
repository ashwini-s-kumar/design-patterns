package decoratorDesignPattern;

import decoratorDesignPattern.pizza.BasePizza;
import decoratorDesignPattern.pizza.ChickenPizza;
import decoratorDesignPattern.pizza.VegPizza;
import decoratorDesignPattern.pizzaTopping.ChickenTopping.Pepperoni;
import decoratorDesignPattern.pizzaTopping.VegTopping.Mushroom;
import decoratorDesignPattern.pizzaTopping.VegTopping.SeasonalVeg;

public class Pizza {
    public static void main(String [] arr)
    {
        // Create first Pizza
        System.out.println("============== 1st Pizza ===================");
        BasePizza pizza1 = new VegPizza();
        System.out.println( pizza1.getDescription() + " : $" + pizza1.cost());

        // Now we add some Topping
        pizza1 = new SeasonalVeg(pizza1);
        System.out.println( pizza1.getDescription() + " : $ " + pizza1.cost());

        pizza1 = new Mushroom(pizza1);
        System.out.println( pizza1.getDescription() + " : $ " + pizza1.cost());

        // Create second Pizza : NON- Veg
        System.out.println("============== 2nd Pizza ===================");
        BasePizza pizza2 = new ChickenPizza();
        pizza2 = new Mushroom(pizza2);
        pizza2 = new Pepperoni(pizza2);

        System.out.println( pizza2.getDescription() + " : $ " + pizza2.cost());

    }
}
