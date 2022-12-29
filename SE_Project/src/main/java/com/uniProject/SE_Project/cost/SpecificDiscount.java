package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
public class SpecificDiscount extends Discount{
	@Override
	public double cost(double amount) {
		
		return amount-0.2*amount;
	}
	
}