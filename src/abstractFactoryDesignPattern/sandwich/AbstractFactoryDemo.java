package abstractFactoryDesignPattern.sandwich;

import abstractFactoryDesignPattern.sandwich.abstractFactory.AbstractFactory;
import abstractFactoryDesignPattern.sandwich.abstractFactory.FactoryGenerator;
import abstractFactoryDesignPattern.sandwich.bread.Bread;
import abstractFactoryDesignPattern.sandwich.enums.BreadType;
import abstractFactoryDesignPattern.sandwich.enums.FactoryType;
import abstractFactoryDesignPattern.sandwich.enums.FillingType;
import abstractFactoryDesignPattern.sandwich.filling.Filling;

public class AbstractFactoryDemo {


    public static void main(String [] arr) {

        AbstractFactory BreadFactory = FactoryGenerator.getFactory(FactoryType.BREAD);
        Bread bread1 = BreadFactory.getBread(BreadType.WHITEBREAD);
        Bread bread2 = BreadFactory.getBread(BreadType.BROWNBREAD);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory(FactoryType.FILLING);
        Filling filling1 = fillingFactory.getFilling(FillingType.EGG);
        Filling filling2 = fillingFactory.getFilling(FillingType.CHEESE);

        System.out.println("================ 1st Sandwich =============");
        System.out.println(bread1.breadDescription() + " and " + filling1.description());
        System.out.println("Calorie = " + (bread1.breadCalorie() + filling1.calorie()));

        System.out.println("================ 2nd Sandwich =============");
        System.out.println(bread1.breadDescription() + " and " + filling2.description());
        System.out.println("Calorie = " + (bread1.breadCalorie() + filling2.calorie()));

        System.out.println("================ 3rd Sandwich =============");
        System.out.println(bread2.breadDescription() + " and " + filling2.description());
        System.out.println("Calorie = " + (bread2.breadCalorie() + filling2.calorie()));
    }

}
