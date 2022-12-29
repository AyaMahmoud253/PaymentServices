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
import com.uniProject.SE_Project.Services.Services;
@RestController
@RequestMapping(value = "/Discount")
public class ControllerDiscount
{
	 Response R=new Response();
	 
    //private Repo DRepository;
	//@Id
      //Discount model=new Discount();
    //DiscountView view;

    /*public void setDiscount(Discount discountModel){
        model.setdiscountModel(discountModel);
     }*/
	 @RequestMapping(value = "/CheckDiscount/{amount}/{TransctionId}/{serviceId}",method = RequestMethod.GET)
	    public String CheckDiscount(@PathVariable ("amount") double amount,
	                                @PathVariable ("TransctionId") int TransctionId,@PathVariable ("serviceId") int serviceId){
		 //Discount d=new Discount(id,amount);
		 //ServicesModel service=new ServiceModel((long) serviceId);
		 //service.setId((long) serviceId);
		 double am=amount-(0.1*amount);
		 double am2=amount-(0.2*amount);
		 double am3=amount-(0.3*amount);
		 if(TransctionId>2||TransctionId<1||serviceId>4||serviceId<1)
		 {
			 R.setMessage("Error: Transction ID Must be 1 for Frist transaction 2 for Not Frist transaction and Service ID Must be 1 for Mobile Recharge or 2 for Donations or 3 for InternetPayment and 4 for LandLineServices"); 
		 }
		 else if(TransctionId==1&&serviceId==1)
			 R.setMessage("You input Transaction ID 1 means Frist transaction and Service ID 1 means MobileRecharge Service your cost After Discount "+am3);
		 else if (TransctionId==1&&serviceId!=1)
			 R.setMessage("You input Transaction ID 1 means Frist transaction your cost After Discount "+am);
		 else if (TransctionId==2&&serviceId==1)
			 R.setMessage("You input Service ID 1 means MobileRecharge Service your cost After Discount "+am2);
		 else if (TransctionId==2&&serviceId!=1)
			 R.setMessage("You Have not Discount "+amount);
		 return R.getMessage();
	    }
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
