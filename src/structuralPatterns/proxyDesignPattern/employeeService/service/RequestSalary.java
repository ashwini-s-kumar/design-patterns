package structuralPatterns.proxyDesignPattern.employeeService.service;

import structuralPatterns.proxyDesignPattern.employeeService.enums.Entity;

public class RequestSalary implements Service{
    @Override
    public void performService(Entity entity) {
        System.out.println(entity.getValue() + " requested salary");
    }
}
