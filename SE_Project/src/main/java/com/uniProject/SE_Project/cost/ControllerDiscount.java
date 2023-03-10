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
@RequestMapping(value = "/user/Discount")
public class ControllerDiscount
{
	 Cost o;
	 //CostModel c;
	 ServicesModel s=new ServicesModel();
	 Response R=new Response();
	 @RequestMapping(value = "/CheckDiscountForm",method = RequestMethod.GET)
	    public String CheckDiscountForm()
	    {
		 R.setMessage("for CheckDiscountin url after port-> Discount/CheckDiscount/{amount}/{TransctionId}/{serviceId}"+"\n"+"\n"+" Transction ID Must be"+"\n"+ " 1 for Frist transaction"+"\n"+" 2 for Not Frist transaction"+"\n"+"\n"+" Service ID Must be"+"\n"+" 1 for Mobile Recharge "+"\n"+" 2 for Donations "+"\n"+" 3 for InternetPayment "+"\n"+" 4 for LandLineServices"); 
		 return R.getMessage();
	    }
	 @RequestMapping(value = "/CheckDiscount/{amount}/{TransctionId}/{serviceId}",method = RequestMethod.GET)
	    public String CheckDiscount(@PathVariable ("amount") double amount,
	                                @PathVariable ("TransctionId") int TransctionId,@PathVariable ("serviceId") int serviceId){
		 //c=new CostModel((long) serviceId);
		 s.setId((long) serviceId);
		 if(TransctionId>2||TransctionId<1||s.getId()>4||s.getId()<1)
		 {
			 R.setMessage("Error: Transction ID Must be 1 for Frist transaction 2 for Not Frist transaction and Service ID Must be 1 for Mobile Recharge or 2 for Donations or 3 for InternetPayment and 4 for LandLineServices"); 
		 }
		else if (TransctionId==1&&s.getId()!=1)
		 {
			 o=new OverallDiscount(o);
			 R.setMessage("You input Transaction ID 1 means Frist transaction your cost After (10%) Discount  "+o.cost(amount,s,serviceId));
		 }
		 else if (TransctionId==2&&s.getId()==1)
		 {
			 o=new SpecificDiscount(o);
			 R.setMessage("You input Service ID 1 means MobileRecharge Service your cost After (20%) Discount "+o.cost(amount,s,serviceId));
		 }
		 else if(TransctionId==1&&s.getId()==1)
		 {
			 double am3=amount-(0.3*amount);
			 R.setMessage("You input Transaction ID 1 means Frist transaction and Service ID 1 means MobileRecharge Service your cost After (30%) Discount "+am3);
		 }
		 else if (TransctionId==2&&s.getId()!=1)
		 {
			 o=new ConcreteCost(); 
			 R.setMessage("You Have not Discount Your cost "+amount);
		 }
		 return R.getMessage();
	    }
}
