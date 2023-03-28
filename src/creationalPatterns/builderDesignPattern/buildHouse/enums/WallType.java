package creationalPatterns.builderDesignPattern.buildHouse.enums;

public enum WallType {

    LOAD_BEARING("LOAD_BEARING"),
    NON_LOAD_BEARING("NON_LOAD_BEARING"),
    CAVITY("CAVITY"),
    SHEAR("SHEAR"),
    RETAINING("RETAINING");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    WallType(String value) {
        this.value = value;
    }
}
