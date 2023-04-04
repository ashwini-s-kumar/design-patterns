package behavioralPatterns.templateDesignPattern.coffeeMaker.concreteSubClasses;

import behavioralPatterns.templateDesignPattern.coffeeMaker.abstractTemplateMethod.CoffeeMaker;

public class AmericanoMaker extends CoffeeMaker {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing American espresso ..");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding hot Water ...");
    }
}
