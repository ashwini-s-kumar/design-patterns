package structuralPatterns.proxyDesignPattern.employeeService.enums;

public enum Entity {
    EMPLOYEE("EMPLOYEE"),
    EMPLOYER("EMPLOYER");

    private String value;

    Entity(String values) {
        this.value = values;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "values='" + value + '\'' +
                '}';
    }
}
