package behavioralPatterns.interpreterDesignPattern.expressions;

import behavioralPatterns.interpreterDesignPattern.expressions.abstractExpression.Expression;
import behavioralPatterns.interpreterDesignPattern.expressions.context.Context;
import behavioralPatterns.interpreterDesignPattern.expressions.nonTerminal.PlusExpression;
import behavioralPatterns.interpreterDesignPattern.expressions.terminal.NumberExpression;

public class Client {
    public static void main(String [] arrs){
        String input = "1+2+3";
        Context context = new Context(input);

        // Build the expression tree
        Expression expression = new PlusExpression(
                new PlusExpression(
                        new NumberExpression(1),
                        new NumberExpression(2)),
                new NumberExpression(3));

        // Interpret and execute the expression
        int result = expression.interpret(context);
        context.setOutput(result);
        System.out.println(input + " = " + context.getOutput());
    }
}
