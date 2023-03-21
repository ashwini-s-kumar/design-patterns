package creationalPatterns.factoryDesignPattern.sandwich;

import creationalPatterns.factoryDesignPattern.sandwich.bread.Bread;
import creationalPatterns.factoryDesignPattern.sandwich.enums.BreadType;
import creationalPatterns.factoryDesignPattern.sandwich.enums.FillingType;
import creationalPatterns.factoryDesignPattern.sandwich.factory.BreadFactory;
import creationalPatterns.factoryDesignPattern.sandwich.factory.FillingFactory;
import creationalPatterns.factoryDesignPattern.sandwich.filling.Filling;

public class FactoryDemo {


    public static void main(String [] arr) {
        Bread bread;
        Filling filling;
        System.out.println("================ 1st Sandwich =============");
        bread = BreadFactory.getBread(BreadType.WHITEBREAD);
        filling = FillingFactory.getFilling(FillingType.EGG);

        System.out.println(bread.breadDescription() + " and " + filling.description());
        System.out.println("Calorie = " + (bread.breadCalorie() + filling.calorie()));

        System.out.println("================ 2nd Sandwich =============");
        bread = BreadFactory.getBread(BreadType.BROWNBREAD);
        filling = FillingFactory.getFilling(FillingType.EGG);

        System.out.println(bread.breadDescription() + " and " + filling.description());
        System.out.println("Calorie = " + (bread.breadCalorie() + filling.calorie()));

        System.out.println("================ 3rd Sandwich =============");
        bread = BreadFactory.getBread(BreadType.BROWNBREAD);
        filling = FillingFactory.getFilling(FillingType.CHEESE);

        System.out.println(bread.breadDescription() + " and " + filling.description());
        System.out.println("Calorie = " + (bread.breadCalorie() + filling.calorie()));
    }

}
