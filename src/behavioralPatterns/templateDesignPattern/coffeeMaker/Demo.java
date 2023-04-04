package behavioralPatterns.templateDesignPattern.coffeeMaker;

import behavioralPatterns.templateDesignPattern.coffeeMaker.abstractTemplateMethod.CoffeeMaker;
import behavioralPatterns.templateDesignPattern.coffeeMaker.concreteSubClasses.AmericanoMaker;
import behavioralPatterns.templateDesignPattern.coffeeMaker.concreteSubClasses.LatteMaker;

public class Demo {
    public static void main(String [] arr){

        CoffeeMaker latte = new LatteMaker();
        latte.makeCoffee();

        CoffeeMaker americano = new AmericanoMaker();
        americano.makeCoffee();
    }
}
