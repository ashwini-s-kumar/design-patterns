package creationalPatterns.builderDesignPattern.buildHouse.enums;

public enum DoorType {

    WOODEN("WOODEN"),
    GLASS("GLASS"),
    METAL("METAL");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    DoorType(String value) {
        this.value = value;
    }
}
