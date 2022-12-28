package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.Response;
import org.springframework.stereotype.Service;

@Service
public class credit {

	Response R=new Response();
	private double limit=900000;
	 
	public String  Pay(double amount ) {
		double result =limit-amount;
		R.setMessage("you paid amount"+amount+"your new balance"+result);
		
		return R.getMessage(); 
	}

    public void setLimit(double r) {
        limit=r;
    }
    public double getLimit() {
        return limit;
    }
}
