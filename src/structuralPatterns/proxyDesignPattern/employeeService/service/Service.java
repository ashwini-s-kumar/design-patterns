package structuralPatterns.proxyDesignPattern.employeeService.service;

import structuralPatterns.proxyDesignPattern.employeeService.enums.Entity;

public interface Service {
    public void performService(Entity entity);
}
