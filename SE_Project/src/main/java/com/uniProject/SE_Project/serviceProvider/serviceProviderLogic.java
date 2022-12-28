package com.uniProject.SE_Project.serviceProvider;

import com.uniProject.SE_Project.user.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class serviceProviderLogic {

    @Autowired
    private Provider pRepo;
    public List<ServiceProviderEntity> getServiceProvider()
    {

        List<ServiceProviderEntity> getAllServices = new ArrayList<>();
        pRepo.findAll().forEach(getAllServices::add);
        return getAllServices;
    }
    public void Adding ()
    {
        ServiceProviderEntity userRecord=new ServiceProviderEntity(1,"Etisalat provider");
        ServiceProviderEntity s2=new ServiceProviderEntity(2,"Vodafone provider");

        pRepo.save(userRecord);
    }

}
