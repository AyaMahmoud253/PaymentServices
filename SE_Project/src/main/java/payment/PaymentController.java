package payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.logic;

import jakarta.websocket.server.PathParam;

import com.uniProject.SE_Project.Repo;
import com.uniProject.SE_Project.controller;
import payment.credit;
import payment.cash;
import java.util.List;

@RestController
public class PaymentController {
	controller usercontrol;
	credit c; 
	cash cah;
	creditcardInfo info;
	UsersModel v;
	logic l;
	@RequestMapping(value = "/setcreditcard/{CCNum}/{pas}/{amount}/{id}",method = RequestMethod.POST)
	public void setInfo(@PathVariable ("CCNum")String cNumber,@PathVariable ("pas") String pas,
			@PathVariable ("amount")double amount,@PathVariable ("id")Integer id) {
		v=usercontrol.getUser(id);
		info=new creditcardInfo(cNumber,pas,v,amount);
		
	}

	 @RequestMapping(value = "/pay",method = RequestMethod.POST)
	 public String   SetAmount(@PathParam ("amount") double amount ,@PathParam ("method") String pmethod,
			 @PathParam ("id") Integer id) {
		 if(pmethod=="credit") {
			v=l.getuser(id);
			return  c.Pay(amount,v); 
		 }
		 else if(pmethod=="cash"){
			 return cah.Pay(amount, v);
		 }
		 
		return "";
	 }

}
