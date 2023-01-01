package com.uniProject.SE_Project.serviceProvider;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public abstract class ServiceProvider {
    String ServicePName;
    
    private int id;

    public ServiceProvider(int id,String servicePName) {
        ServicePName = servicePName;
        this.id=id;
    }

   

    public abstract boolean checkForm(Map<String,Object> form) ;
    public abstract String getReqFields();
    public abstract void handle(Map<String,Object> form);
    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
    public void setServicePName(String n)
    {ServicePName = n;}
    public String getServicePName() {
    	return ServicePName;
    }
   
}
