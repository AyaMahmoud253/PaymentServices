package com.uniProject.SE_Project.serviceProvider;

import java.util.Map;

public class CancerHospital extends ServiceProvider{
	
	public CancerHospital() {
       super(1,"Cancer Hospital");
    }
	@Override
	public boolean checkForm(Map<String, Object> form) {
		if(form.get("MobileNumber") == null)
			return false;
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getReqFields() {
		
		// TODO Auto-generated method stub
		return "The required field is MobileNumber";
	}

	@Override
	public void handle(Map<String, Object> form) {
		// TODO Auto-generated method stub
		
	}
	
}
