package creationalPatterns.abstractFactoryDesignPattern.sandwich.factory;

import creationalPatterns.abstractFactoryDesignPattern.sandwich.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.bread.Bread;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.bread.BrownBread;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.bread.WhiteBread;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.BreadType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.enums.FillingType;
import creationalPatterns.abstractFactoryDesignPattern.sandwich.filling.Filling;

public class BreadFactory extends AbstractFactory {

   @Override
   public Bread getBread(BreadType type){
        if(type == null){
            return null;
        }
        if(type.equals(BreadType.WHITEBREAD)){
            return new WhiteBread();
        }
        if(type.equals(BreadType.BROWNBREAD)){
            return new BrownBread();
        }
        return null;
    }

    @Override
    public Filling getFilling(FillingType type) {
        return null;
    }
}
