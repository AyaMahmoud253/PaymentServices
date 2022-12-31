package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
import com.uniProject.SE_Project.Services.ServicesModel;

public class SpecificDiscount extends Discount{
	public SpecificDiscount(Cost decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public double cost(double amount,ServicesModel s,int serviceId) {
		s.setId((long) serviceId);
		return amount-0.2*amount;
	}
	
}