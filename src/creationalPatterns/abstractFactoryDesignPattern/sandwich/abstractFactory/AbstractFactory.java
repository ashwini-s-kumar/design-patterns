package creationalPatterns.abstractFactoryDesignPattern.sandwich.abstractFactory;

import creationalPatterns.abstractFactoryDesignPattern.sandwich.bread.Bread;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.BreadType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.FillingType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.filling.Filling;

public abstract class AbstractFactory {
    public abstract Bread getBread(BreadType type);

    public abstract Filling getFilling(FillingType type);
}
