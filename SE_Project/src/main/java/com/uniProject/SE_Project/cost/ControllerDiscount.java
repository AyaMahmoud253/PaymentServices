package com.uniProject.SE_Project.cost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.logic;
import jakarta.websocket.server.PathParam;
import com.uniProject.SE_Project.user.Repo;
import com.uniProject.SE_Project.user.Response;
import com.uniProject.SE_Project.user.controller;
import com.uniProject.SE_Project.Services.ServicesModel;
@RestController
@RequestMapping(value = "/Discount")
public class ControllerDiscount
{
	 Response R=new Response();
    //private Repo DRepository;
	//@Id
     // Discount model=new Discount();
    //DiscountView view;

    /*public void setDiscount(Discount discountModel){
        model.setdiscountModel(discountModel);
     }*/

	 @RequestMapping(value = "/Specificamount/{amount}", method = RequestMethod.GET)
    public String Specificamount(@PathVariable ("amount")double amount){
    	//amount=model.getamount()-(0.1*model.getamount());
        //model.setamount(amount);
        //amount=model.getamount()-(0.1*model.getamount());
		 double am=amount-(0.2*amount);
		 //String S=service;
		 /*s.setName(service);
		 if(s.getserviceName()=="MOBILE")
		 {R.setMessage("you cost " +am);}
		 else
		 {R.setMessage("you cost "+amount);}*/
		 
		 R.setMessage("you cost before discount: "+amount+" and you cost after discount: "+am);
		 return R.getMessage();
        //return model.getamount()-(0.2*model.getamount());
     }
	 @RequestMapping(value = "/Overallamount/{amount}", method = RequestMethod.GET)
    public String Overallamount(@PathVariable ("amount")double amount){
    	//amount=model.getamount()-(0.2*model.getamount());
        //model.setamount(amount);
		 double am=amount-(0.1*amount);
		 R.setMessage("you cost before discount: "+amount+" and you cost after discount: "+am);
		 return R.getMessage();
		 
     }
	 @RequestMapping(value = "/SpecificOverallamount/{amount}", method = RequestMethod.GET)
    public String SpecificOverallamount(@PathVariable ("amount")double amount){
    	//amount=model.getamount()-(0.3*model.getamount());
        //model.setamount(amount);
		 double am=amount-(0.3*amount);
		 R.setMessage("you cost before discount: "+amount+" and you cost after discount: "+am);
		 return R.getMessage();
     }
    /*@RequestMapping(value = "/getamount/{amount}", method = RequestMethod.GET)
    public double getamount(@PathVariable ("amount") double amount){
    	//double am=  model.getamount()-(0.1*model.getamount());
    	//model.setamount(am);
        return amount-(0.1*amount);
    	//return amount;
    	//return id;
     }*/
}
