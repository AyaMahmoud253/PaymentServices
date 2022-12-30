package com.uniProject.SE_Project.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    private logic logicBusiness;
    public controller(logic logicbusiness) {
    	this.logicBusiness= logicbusiness;
    	
    }
    @RequestMapping(value="/user",method=RequestMethod.POST)
    public String SignUp(@RequestBody UsersModel usermodel) {
    	return logicBusiness.add(usermodel);
    }

    
    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public UsersModel getSignInformation(@PathVariable("id")int id) {
    	return logicBusiness.getUser(id);
    }
    

    
}