package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.Response;
import org.springframework.stereotype.Service;


public class credit implements ordinaryPayment{

	Response R=new Response();
	
	 
	@Override
	public String  Pay(double amount) {
		R.setMessage("you pay credit "+amount);
		
		return R.getMessage();
	}

   
}
