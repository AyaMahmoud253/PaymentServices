package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.Response;
import org.springframework.stereotype.Service;

@Service

public class cash {
	Response R=new Response();

	public String  Pay() {
		R.setMessage("you pay cash ");
		
		return R.getMessage();
	}
	

}
