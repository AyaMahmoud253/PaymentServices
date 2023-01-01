package com.uniProject.SE_Project.serviceProvider;

import java.util.Map;

public class Orange extends ServiceProvider{
	
	public Orange() {
       super(4,"Orange");
    }
	@Override
	public boolean checkForm(Map<String, Object> form) {
		if(form.get("MobileNumber") == null)
			return false;
		if(form.get("Amount") == null)
			return false;
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getReqFields() {
		
		// TODO Auto-generated method stub
		return "The required fields are MobileNumber and Amount";
	}

	@Override
	public void handle(Map<String, Object> form) {
		// TODO Auto-generated method stub
		
	}
	
}
