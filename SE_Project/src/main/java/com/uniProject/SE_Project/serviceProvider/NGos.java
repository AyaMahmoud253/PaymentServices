package com.uniProject.SE_Project.serviceProvider;

import java.util.Map;

public class NGos extends ServiceProvider{
	
	public NGos() {
       super(3,"NGos");
    }
	@Override
	public boolean checkForm(Map<String, Object> form) {
		if(form.get("MobileNumber") == null)
			return false;
		if(form.get("Amount") == null)
			return false;
		if(form.get("ZipCode") == null)
			return false;
		// TODO Auto-generated method stub
		return true;
	}


	public String getReqFields() {
		
		// TODO Auto-generated method stub
		return "The required fields are MobileNumber , Amount and ZipCode";
	}

	@Override
	public void handle(Map<String, Object> form) {
		// TODO Auto-generated method stub
		
	}
	
}
