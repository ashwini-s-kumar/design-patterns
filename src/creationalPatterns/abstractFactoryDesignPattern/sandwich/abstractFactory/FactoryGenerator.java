package creationalPatterns.abstractFactoryDesignPattern.sandwich.abstractFactory;

import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.FactoryType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.factory.BreadFactory;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.factory.FillingFactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(FactoryType type){
        if(type == null){
            return null;
        }
        if(type.equals(FactoryType.BREAD)){
            return new BreadFactory();
        }
        if(type.equals(FactoryType.FILLING)){
            return new FillingFactory();
        }
        return null;
    }
}
