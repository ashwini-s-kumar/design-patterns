package abstractFactoryDesignPattern.sandwich.enums;

public enum BreadType {
    WHITEBREAD("WHITE_BREAD"),
    BROWNBREAD("BROWN_BREAD");

    private String value;

    BreadType(String value) {
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
        return "BreadType{" +
                "value='" + value + '\'' +
                '}';
    }
}
