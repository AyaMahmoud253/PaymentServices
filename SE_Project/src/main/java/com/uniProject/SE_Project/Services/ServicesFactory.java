package com.uniProject.SE_Project.Services;

import com.uniProject.SE_Project.user.UsersModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ServicesFactory {
    public ServicesFactory(){}
    public List<String>  AddServices()
    {
        List<String> services=new ArrayList<>();
        services.add("LANDLINE");
        services.add("MOBILE");
        services.add("DONATIONS");
        services.add("INTERNET");
        return services;
    }

    public String search(String find){
        String result=find.toUpperCase();
        List<String> services=new ArrayList<>();
        services=AddServices();
        for (String s: services) {
            if(Objects.equals(s, result)){
              return s;
            }
        }
        return "Notfound";
    }






}
