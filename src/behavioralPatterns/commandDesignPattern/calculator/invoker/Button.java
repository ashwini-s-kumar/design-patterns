package behavioralPatterns.commandDesignPattern.calculator.invoker;

import behavioralPatterns.commandDesignPattern.calculator.command.Command;

public class Button {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
