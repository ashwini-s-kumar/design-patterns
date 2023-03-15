package abstractFactoryDesignPattern.sandwich.abstractFactory;

import abstractFactoryDesignPattern.sandwich.bread.Bread;
import abstractFactoryDesignPattern.sandwich.enums.BreadType;
import abstractFactoryDesignPattern.sandwich.enums.FillingType;
import abstractFactoryDesignPattern.sandwich.filling.Filling;

public abstract class AbstractFactory {
    public abstract Bread getBread(BreadType type);

    public abstract Filling getFilling(FillingType type);
}
