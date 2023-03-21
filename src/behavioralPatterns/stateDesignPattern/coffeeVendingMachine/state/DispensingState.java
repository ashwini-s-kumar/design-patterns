package behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine.CoffeeMachine;

public class DispensingState implements State{
    @Override
    public void selectCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("Please wait while the coffee is dispensed");
    }

    @Override
    public void insertMoney(CoffeeMachine coffeeMachine) {
        System.out.println("Please wait while the coffee is dispensed");
    }

    @Override
    public void dispenseCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("The coffee is dispensed");
        coffeeMachine.changeState(new NoSelectionState());
    }
}
