package creationalPatterns.factoryDesignPattern.sandwich.factory;

import creationalPatterns.factoryDesignPattern.sandwich.enums.FillingType;
import creationalPatterns.factoryDesignPattern.sandwich.filling.Cheese;
import creationalPatterns.factoryDesignPattern.sandwich.filling.Egg;
import creationalPatterns.factoryDesignPattern.sandwich.filling.Filling;

public class FillingFactory {
    public static Filling getFilling(FillingType type){
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
}
