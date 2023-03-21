package proxyDesignPattern.employeeService.proxy;

import proxyDesignPattern.employeeService.enums.Entity;
import proxyDesignPattern.employeeService.service.*;

public class ProxyService implements Service{
    Service service;

    public ProxyService(Service service){
        this.service = service;
    }

    @Override
    public void performService(Entity entity) {
        if(entity.equals(Entity.EMPLOYEE)){
            if(service instanceof  ApplyLeave){
                service.performService(entity);
            }
            else if(service instanceof RequestSalary){
                service.performService(entity);
            }else{
                System.out.println("Requested service :"+ service.getClass() + " cannot be performed by "+ entity.getValue());
            }
        }else{
            if(service instanceof  ApproveLeave){
                service.performService(entity);
            }
            else if(service instanceof SendSalary){
                service.performService(entity);
            }else{
                System.out.println("Requested service :"+ service.getClass() + " cannot be performed by "+ entity.getValue());
            }
        }

    }
}
