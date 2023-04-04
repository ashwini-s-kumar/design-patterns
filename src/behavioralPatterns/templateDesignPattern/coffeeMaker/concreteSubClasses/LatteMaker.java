package behavioralPatterns.templateDesignPattern.coffeeMaker.concreteSubClasses;

import behavioralPatterns.templateDesignPattern.coffeeMaker.abstractTemplateMethod.CoffeeMaker;

public class LatteMaker extends CoffeeMaker {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing Latte espresso ...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding steamed milk and sugar ... ");
    }
}
