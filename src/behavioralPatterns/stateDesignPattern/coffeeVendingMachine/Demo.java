package behavioralPatterns.stateDesignPattern.coffeeVendingMachine;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine.CoffeeMachine;
import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state.NoSelectionState;

public class Demo {
    public static void main(String [] arr){
        CoffeeMachine machine = new CoffeeMachine(new NoSelectionState());
        machine.selectCoffee();
        machine.insertMoney();
        machine.dispenseCoffee();

        machine.dispenseCoffee();
        machine.insertMoney();

        machine.selectCoffee();
        machine.dispenseCoffee();

        machine.selectCoffee();
        machine.insertMoney();
        machine.dispenseCoffee();
    }
}
