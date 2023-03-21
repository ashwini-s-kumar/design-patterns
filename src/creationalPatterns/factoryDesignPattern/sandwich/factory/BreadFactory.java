package creationalPatterns.factoryDesignPattern.sandwich.factory;

import creationalPatterns.factoryDesignPattern.sandwich.bread.Bread;
import creationalPatterns.factoryDesignPattern.sandwich.bread.BrownBread;
import creationalPatterns.factoryDesignPattern.sandwich.bread.WhiteBread;
import creationalPatterns.factoryDesignPattern.sandwich.enums.BreadType;

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
