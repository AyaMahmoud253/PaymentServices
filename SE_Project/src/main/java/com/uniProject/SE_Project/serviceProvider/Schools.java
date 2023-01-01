package com.uniProject.SE_Project.serviceProvider;

import java.util.Map;

public class Schools extends ServiceProvider{
	
	public Schools() {
       super(5,"Schools");
    }
	@Override
	public boolean checkForm(Map<String, Object> form) {
		if(form.get("NationalID") == null)
			return false;
		return true;
	}

	@Override
	public String getReqFields() {
		
		// TODO Auto-generated method stub
		return "The required field is NationalID";
	}

	@Override
	public void handle(Map<String, Object> form) {
		// TODO Auto-generated method stub
		
	}
	

}
