package behavioralPatterns.interpreterDesignPattern.expressions.abstractExpression;

import behavioralPatterns.interpreterDesignPattern.expressions.context.Context;

public interface Expression {
    int interpret(Context context);
}
