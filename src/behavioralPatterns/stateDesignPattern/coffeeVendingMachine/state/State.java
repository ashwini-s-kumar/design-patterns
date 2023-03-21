package behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine.CoffeeMachine;

public interface State {
    public void selectCoffee(CoffeeMachine coffeeMachine);
    public void insertMoney(CoffeeMachine coffeeMachine);
    public void dispenseCoffee(CoffeeMachine coffeeMachine);
}
