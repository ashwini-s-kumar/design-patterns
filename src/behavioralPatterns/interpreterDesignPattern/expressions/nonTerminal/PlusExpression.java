package behavioralPatterns.interpreterDesignPattern.expressions.nonTerminal;

import behavioralPatterns.interpreterDesignPattern.expressions.abstractExpression.Expression;
import behavioralPatterns.interpreterDesignPattern.expressions.context.Context;

public class PlusExpression implements Expression {
    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
