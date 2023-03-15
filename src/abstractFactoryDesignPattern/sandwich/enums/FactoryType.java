package abstractFactoryDesignPattern.sandwich.enums;

public enum FactoryType {
    BREAD("BREAD"),
    FILLING("FILLING");
    private String value;

    FactoryType(String value) {
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
        return "FactoryType{" +
                "value='" + value + '\'' +
                '}';
    }
}
