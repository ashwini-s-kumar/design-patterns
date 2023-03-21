package structuralPatterns.proxyDesignPattern.employeeService.service;

import structuralPatterns.proxyDesignPattern.employeeService.enums.Entity;

public class ApproveLeave implements Service{
    @Override
    public void performService(Entity entity) {
        System.out.println(entity.getValue() + " approved leave");
    }
}
