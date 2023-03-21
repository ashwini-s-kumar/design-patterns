package behavioralPatterns.stateDesignPattern.coffeeVendingMachine.machine;

import behavioralPatterns.stateDesignPattern.coffeeVendingMachine.state.State;

public class CoffeeMachine {
    State state;

    public CoffeeMachine(State state){
        this.state = state;
    }

    public void changeState(State state){
        this.state = state;
    }

    public void selectCoffee(){
        state.selectCoffee(this);
    }

    public void insertMoney(){
        state.insertMoney(this);
    }

    public void dispenseCoffee(){
        state.dispenseCoffee(this);
    }
}
