package factoryDesignPattern.sandwich.factory;

import factoryDesignPattern.sandwich.enums.FillingType;
import factoryDesignPattern.sandwich.filling.Cheese;
import factoryDesignPattern.sandwich.filling.Egg;
import factoryDesignPattern.sandwich.filling.Filling;

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
