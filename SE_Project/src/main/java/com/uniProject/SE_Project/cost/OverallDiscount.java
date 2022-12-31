package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
import com.uniProject.SE_Project.Services.ServicesModel;

public class OverallDiscount extends Discount
{
   
	public OverallDiscount(Cost cost) {
		super(cost);
		}
 
	@Override
	public double cost(double amount,ServicesModel s,int serviceId){
		s.setId((long) serviceId);
		return amount-0.1*amount;
	}
	
}
