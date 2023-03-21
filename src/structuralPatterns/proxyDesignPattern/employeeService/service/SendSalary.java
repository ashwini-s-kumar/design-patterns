package structuralPatterns.proxyDesignPattern.employeeService.service;

import structuralPatterns.proxyDesignPattern.employeeService.enums.Entity;

public class SendSalary implements Service{
    @Override
    public void performService(Entity entity) {
        System.out.println(entity.getValue() + " sent salary");
    }
}
