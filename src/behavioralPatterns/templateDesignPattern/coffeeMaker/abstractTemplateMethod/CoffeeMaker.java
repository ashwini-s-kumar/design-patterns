package behavioralPatterns.templateDesignPattern.coffeeMaker.abstractTemplateMethod;

public abstract class CoffeeMaker {

    // This is a template method -- it is always final
    public final void makeCoffee(){
        boilWater();
        brewCoffee();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boiling water ...");
    }
    public abstract void brewCoffee();

    public void pourInCup(){
        System.out.println("Pouring in cup .....");
    }

    public abstract void addCondiments();

}
