package factoryDesignPattern.sandwich.enums;

public enum FillingType {
    CHEESE("CHEESE"),
    EGG("EGG");

    private String value;

    FillingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FillingType{" +
                "value='" + value + '\'' +
                '}';
    }
}
