package com.uniProject.SE_Project.serviceProvider;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServiceProviderEntity {
    String ServicePName;
    @Id
    private int id;

    public ServiceProviderEntity(int id,String servicePName) {
        ServicePName = servicePName;
        this.id=id;
    }

    public ServiceProviderEntity() {

    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

}
