package factoryDesignPattern.sandwich.factory;

import factoryDesignPattern.sandwich.bread.Bread;
import factoryDesignPattern.sandwich.bread.BrownBread;
import factoryDesignPattern.sandwich.bread.WhiteBread;
import factoryDesignPattern.sandwich.enums.BreadType;

public class BreadFactory {
    public static Bread getBread(BreadType type){
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
}
