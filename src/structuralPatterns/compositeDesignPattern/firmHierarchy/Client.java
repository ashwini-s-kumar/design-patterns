package structuralPatterns.compositeDesignPattern.firmHierarchy;

import structuralPatterns.compositeDesignPattern.firmHierarchy.component.Employee;
import structuralPatterns.compositeDesignPattern.firmHierarchy.composite.Manager;
import structuralPatterns.compositeDesignPattern.firmHierarchy.leaf.Developer;

public class Client {

    public static void main(String [] arr){
        Employee john = new Developer("John");
        Employee jane = new Developer("Jane");

        Manager manager = new Manager("Bob");
        manager.addEmployee(john);
        manager.addEmployee(jane);

        manager.work();

        Manager generalManager = new Manager("Mike");
        generalManager.addEmployee(manager);

        generalManager.work();
    }
}
