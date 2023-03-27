package behavioralPatterns.commandDesignPattern.calculator.receiver;

public class Calculator {
    private int result;

    public void add(int num){
        result += num;
    }

    public void sub(int num){
        result -= num;
    }

    public int getResult(){
        return result;
    }
}
