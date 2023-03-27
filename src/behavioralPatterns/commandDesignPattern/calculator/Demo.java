package behavioralPatterns.commandDesignPattern.calculator;

import behavioralPatterns.commandDesignPattern.calculator.command.AddCommand;
import behavioralPatterns.commandDesignPattern.calculator.command.Command;
import behavioralPatterns.commandDesignPattern.calculator.command.SubCommand;
import behavioralPatterns.commandDesignPattern.calculator.invoker.Button;
import behavioralPatterns.commandDesignPattern.calculator.receiver.Calculator;

import javax.swing.plaf.basic.BasicButtonUI;

public class Demo {
    public static void main(String [] arr){
        Calculator calculator = new Calculator();

        Command addCommand = new AddCommand(calculator, 100);
        Command subCommand = new SubCommand(calculator, 70);

        Button button = new Button();
        button.setCommand(addCommand);
        button.press();

        button.setCommand(subCommand);
        button.press();

        System.out.println("The result is :"+calculator.getResult());
    }
}
