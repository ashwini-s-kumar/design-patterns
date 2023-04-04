package structuralPatterns.compositeDesignPattern.firmHierarchy.component;

public abstract class Employee {
    public Employee(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}
