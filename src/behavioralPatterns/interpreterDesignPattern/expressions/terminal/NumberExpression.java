package behavioralPatterns.interpreterDesignPattern.expressions.terminal;

import behavioralPatterns.interpreterDesignPattern.expressions.abstractExpression.Expression;
import behavioralPatterns.interpreterDesignPattern.expressions.context.Context;

public class NumberExpression implements Expression {

    int num;

    public NumberExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret(Context context) {
        return num;
    }
}
