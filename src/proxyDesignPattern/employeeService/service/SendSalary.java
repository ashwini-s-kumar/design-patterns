package proxyDesignPattern.employeeService.service;

import proxyDesignPattern.employeeService.enums.Entity;

public class SendSalary implements Service{
    @Override
    public void performService(Entity entity) {
        System.out.println(entity.getValue() + " sent salary");
    }
}
