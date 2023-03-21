package proxyDesignPattern.employeeService.service;

import proxyDesignPattern.employeeService.enums.Entity;

public class ApplyLeave implements Service{
    @Override
    public void performService(Entity entity) {
        System.out.println(entity.getValue() + " applied leave");
    }
}
