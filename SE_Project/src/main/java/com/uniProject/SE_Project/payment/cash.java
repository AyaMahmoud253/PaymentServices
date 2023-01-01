package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.Response;
import org.springframework.stereotype.Service;



public class cash implements ordinaryPayment {
	Response R=new Response();
	@Override
	public String  Pay(double amount) {
		R.setMessage("you pay cash " + amount);
		
		return R.getMessage();
	}

	
	

}
