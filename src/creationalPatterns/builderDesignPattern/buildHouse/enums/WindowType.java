package creationalPatterns.builderDesignPattern.buildHouse.enums;

public enum WindowType {

    SKY_LIGHTS("SKY_LIGHTS"),
    DOUBLE_HUNG("DOUBLE_HUNG"),
    CASEMENT("CASEMENT");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    WindowType(String value) {
        this.value = value;
    }
}
