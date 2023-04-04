package structuralPatterns.compositeDesignPattern.firmHierarchy.leaf;

import structuralPatterns.compositeDesignPattern.firmHierarchy.component.Employee;

public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " : working");
    }
}
