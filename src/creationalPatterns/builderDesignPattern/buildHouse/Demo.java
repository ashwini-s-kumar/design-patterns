package creationalPatterns.builderDesignPattern.buildHouse;

import creationalPatterns.builderDesignPattern.buildHouse.builder.House;
import creationalPatterns.builderDesignPattern.buildHouse.enums.DoorType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.RoofType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.WallType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.WindowType;

public class Demo {
    public static void main(String [] arr){

        House house1 = new House.HouseBuilder(WallType.CAVITY)
                .addDoor(DoorType.GLASS)
                .addWindow(WindowType.CASEMENT)
                .addRoof(RoofType.DUCHED_GABLE)
                .addGarden(true)
                .build();
        System.out.println(house1);

        House house2 = new House.HouseBuilder(WallType.SHEAR)
                .addDoor(DoorType.METAL)
                .addWindow(WindowType.SKY_LIGHTS)
                .addRoof(RoofType.SHED)
                .addGarden(true)
                .build();
        System.out.println(house2);

    }
}
