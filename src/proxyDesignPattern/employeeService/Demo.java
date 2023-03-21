package proxyDesignPattern.employeeService;

import proxyDesignPattern.employeeService.enums.Entity;
import proxyDesignPattern.employeeService.proxy.ProxyService;
import proxyDesignPattern.employeeService.service.ApplyLeave;
import proxyDesignPattern.employeeService.service.ApproveLeave;
import proxyDesignPattern.employeeService.service.RequestSalary;
import proxyDesignPattern.employeeService.service.SendSalary;

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
