package behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine.CoffeeMachine;

public class NoSelectionState implements State{

    @Override
    public void selectCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee is selected");
        coffeeMachine.changeState(new HasSelectionState());
    }

    @Override
    public void insertMoney(CoffeeMachine coffeeMachine) {
        System.out.println("please select the coffee before inserting the money");
    }

    @Override
    public void dispenseCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("please select the coffee and insert money to dispense coffee");
    }
}
