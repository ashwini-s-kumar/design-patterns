package structuralPatterns.compositeDesignPattern.firmHierarchy.composite;

import structuralPatterns.compositeDesignPattern.firmHierarchy.component.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Employee> employees = new ArrayList<>();

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
       System.out.println(this.getName() +" starting the work.");
       for(Employee e : employees){
           e.work();
       }
    }

    public void addEmployee(Employee emp){
        this.employees.add(emp);
    }
}
