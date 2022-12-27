package com.uniProject.SE_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.logic;
import com.uniProject.SE_Project.Repo;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private logic getservice;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<UsersModel> getAllUser()
    {
        return getservice.getAlUsers();
    }


    @RequestMapping(value = "/sign-in", method = RequestMethod.POST)
    public void addUser(@RequestBody UsersModel userRecord)
    {
        getservice.signIn(userRecord);
        
    }
    @RequestMapping(value = "/getuser/{id}", method = RequestMethod.GET)
    public UsersModel getUser(@PathVariable ("id") int id)
    {
        return getservice.getuser(id);
    }
    /* @GetMapping("/m/{id}")
    @ResponseBody
    public String getamount(@PathVariable String id){
    	//double am=  model.getamount()-(0.1*model.getamount());
    	//model.setamount(am);
       // return model.getamount(); 
    	return id;
     }*/
    
}

