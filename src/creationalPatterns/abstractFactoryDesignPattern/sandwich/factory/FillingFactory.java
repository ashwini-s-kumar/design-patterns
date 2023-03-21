package creationalPatterns.abstractFactoryDesignPattern.sandwich.factory;

import creationalPatterns.abstractFactoryDesignPattern.sandwich.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.bread.Bread;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.BreadType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.FillingType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.filling.Cheese;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.filling.Egg;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.filling.Filling;

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
