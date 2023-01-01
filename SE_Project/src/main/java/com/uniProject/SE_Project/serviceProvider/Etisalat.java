package com.uniProject.SE_Project.serviceProvider;
import java.util.Map;

public class Etisalat extends ServiceProvider{
	
	public Etisalat() {
       super(2,"Etisalat");
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