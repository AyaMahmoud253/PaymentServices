package com.uniProject.SE_Project.user;

import org.springframework.stereotype.Service;

@Service
public class logic {
	
    private final  Repo repo;
    public logic( Repo repo) {
    	this.repo=repo;
    }
    public String add(UsersModel usermodel) {
    	if(repo.existById(usermodel.getId())) {
    		return "This account already signed to the system";
    		
    	}
    	repo.add(usermodel);
    	return "Account Added Successfully";
    }
    public UsersModel getUser(int id) {
    	return repo.findById(id);
    }
    
}