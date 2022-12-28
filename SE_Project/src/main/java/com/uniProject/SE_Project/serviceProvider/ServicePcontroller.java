package com.uniProject.SE_Project.serviceProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/serviceProvider")
public class ServicePcontroller {
    @Autowired
    private serviceProviderLogic lo;
    @RequestMapping(value = "/getAll-servicesProvider",method = RequestMethod.GET)
    public List<ServiceProviderEntity> getServiceProvider(){
        return lo.getServiceProvider();
    }
}
