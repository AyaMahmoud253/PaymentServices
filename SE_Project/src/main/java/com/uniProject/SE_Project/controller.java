package com.uniProject.SE_Project;
import Cost.Discount;
import Cost.DiscountView;

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

import jakarta.websocket.server.PathParam;

import com.uniProject.SE_Project.Repo;

import java.util.List;

import org.springframework.stereotype.Controller;
@RestController
//@RequestMapping("/controller")

public class controller {
	Response R=new Response();
	private Discount model=new Discount();
	private DiscountView view=new DiscountView();
    @Autowired
    private logic getservice;
    //Discount model;
    
    public void setDiscount(Discount discountModel){
        model.setdiscountModel(discountModel);      
     }
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
    @RequestMapping(value = "/setamount/{amount}", method = RequestMethod.POST)
    public void setOverallamount(@PathVariable ("amount") double amount){
    	//model.setamount(amount);
    	//amount=model.getamount()-(0.1*model.getamount());
        //model.setamount(amount);      
     }
    //for try
    @RequestMapping(value = "/CheckFristTransactionDiscount/{amount}", method = RequestMethod.GET)
    public double getamount(@PathVariable ("amount") double amount){
    	model.setamount(amount);
    	double am=  model.getamount()-(0.1*model.getamount());
    	model.setamount(am);
    	R.setMessage("Your Cost is: ");
    	R.getMessage();
        return model.getamount(); 
     }
    @RequestMapping(value = "/Update", method = RequestMethod.GET)
    public void updateView()
    {
        view.printStudentDetails(model.getamount());
    }   
    
}

