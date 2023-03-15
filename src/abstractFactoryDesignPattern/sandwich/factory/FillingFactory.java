package abstractFactoryDesignPattern.sandwich.factory;

import abstractFactoryDesignPattern.sandwich.abstractFactory.AbstractFactory;
import abstractFactoryDesignPattern.sandwich.bread.Bread;
import abstractFactoryDesignPattern.sandwich.enums.BreadType;
import abstractFactoryDesignPattern.sandwich.enums.FillingType;
import abstractFactoryDesignPattern.sandwich.filling.Cheese;
import abstractFactoryDesignPattern.sandwich.filling.Egg;
import abstractFactoryDesignPattern.sandwich.filling.Filling;

public class FillingFactory extends AbstractFactory {

    @Override
    public Filling getFilling(FillingType type){
        if(type == null){
            return null;
        }
        if(type.equals(FillingType.CHEESE)){
            return new Cheese();
        }
        if(type.equals(FillingType.EGG)){
            return new Egg();
        }
        return null;
    }
    @Override
    public Bread getBread(BreadType type) {
        return null;
    }
}
