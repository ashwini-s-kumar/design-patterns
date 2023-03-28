package creationalPatterns.builderDesignPattern.buildHouse.builder;


import creationalPatterns.builderDesignPattern.buildHouse.enums.DoorType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.RoofType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.WallType;
import creationalPatterns.builderDesignPattern.buildHouse.enums.WindowType;

public  class House {
    private DoorType doorType;
    private WindowType windowType;
    private WallType wallType;
    private RoofType roofType;
    private boolean hasGarden;

    public House(HouseBuilder builder){
        this.wallType = builder.wallType;
        this.doorType = builder.doorType;
        this.windowType = builder.windowType;
        this.roofType = builder.roofType;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "doorType=" + doorType +
                ", windowType=" + windowType +
                ", wallType=" + wallType +
                ", roofType=" + roofType +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public  static class HouseBuilder {

        private  WallType wallType;
        private DoorType doorType;
        private WindowType windowType;
        private RoofType roofType;
        private boolean hasGarden;

        public HouseBuilder(WallType wallType) {
            this.wallType = wallType;
        }

        public HouseBuilder addWindow(WindowType windowType) {
            this.windowType = windowType;
            return this;
        }

        public HouseBuilder addDoor(DoorType doorType) {
            this.doorType = doorType;
            return this;
        }

        public HouseBuilder addRoof(RoofType roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder addGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

}
