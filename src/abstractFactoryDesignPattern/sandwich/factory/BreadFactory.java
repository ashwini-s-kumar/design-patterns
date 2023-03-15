package abstractFactoryDesignPattern.sandwich.factory;

import abstractFactoryDesignPattern.sandwich.abstractFactory.AbstractFactory;
import abstractFactoryDesignPattern.sandwich.bread.Bread;
import abstractFactoryDesignPattern.sandwich.bread.BrownBread;
import abstractFactoryDesignPattern.sandwich.bread.WhiteBread;
import abstractFactoryDesignPattern.sandwich.enums.BreadType;
import abstractFactoryDesignPattern.sandwich.enums.FillingType;
import abstractFactoryDesignPattern.sandwich.filling.Filling;

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
