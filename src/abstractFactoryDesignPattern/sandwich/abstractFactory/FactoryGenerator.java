package abstractFactoryDesignPattern.sandwich.abstractFactory;

import abstractFactoryDesignPattern.sandwich.enums.FactoryType;
import abstractFactoryDesignPattern.sandwich.enums.FillingType;
import abstractFactoryDesignPattern.sandwich.factory.BreadFactory;
import abstractFactoryDesignPattern.sandwich.factory.FillingFactory;
import abstractFactoryDesignPattern.sandwich.filling.Filling;

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
