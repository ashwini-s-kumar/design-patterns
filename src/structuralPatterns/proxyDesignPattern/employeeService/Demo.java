package structuralPatterns.proxyDesignPattern.employeeService;

import structuralPatterns.proxyDesignPattern.employeeService.enums.Entity;
import structuralPatterns.proxyDesignPattern.employeeService.proxy.ProxyService;
import structuralPatterns.proxyDesignPattern.employeeService.service.ApplyLeave;
import structuralPatterns.proxyDesignPattern.employeeService.service.ApproveLeave;
import structuralPatterns.proxyDesignPattern.employeeService.service.RequestSalary;
import structuralPatterns.proxyDesignPattern.employeeService.service.SendSalary;

public class Demo {
    public static void main(String [] arr){
        ProxyService service = new ProxyService(new SendSalary());
        service.performService(Entity.EMPLOYEE);
        service.performService(Entity.EMPLOYER);

        service = new ProxyService(new RequestSalary());
        service.performService(Entity.EMPLOYEE);
        service.performService(Entity.EMPLOYER);

        service = new ProxyService(new ApplyLeave());
        service.performService(Entity.EMPLOYEE);
        service.performService(Entity.EMPLOYER);

        service = new ProxyService(new ApproveLeave());
        service.performService(Entity.EMPLOYEE);
        service.performService(Entity.EMPLOYER);
    }
}
