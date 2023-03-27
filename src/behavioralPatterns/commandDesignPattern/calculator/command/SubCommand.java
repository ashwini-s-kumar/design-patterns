package behavioralPatterns.commandDesignPattern.calculator.command;

import behavioralPatterns.commandDesignPattern.calculator.receiver.Calculator;

public class SubCommand implements Command{
    private Calculator calculator;
    private int operand;

    public SubCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.sub(operand);
    }
}
