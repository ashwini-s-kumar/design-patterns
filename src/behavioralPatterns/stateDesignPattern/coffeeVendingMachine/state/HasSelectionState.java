package behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine.CoffeeMachine;

public class HasSelectionState implements State{
    @Override
    public void selectCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("The coffee is selected");
    }

    @Override
    public void insertMoney(CoffeeMachine coffeeMachine) {
        System.out.println("The money is inserted");
        coffeeMachine.changeState(new DispensingState());
    }

    @Override
    public void dispenseCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("Please insert the money to dispense the coffee");
    }
}
