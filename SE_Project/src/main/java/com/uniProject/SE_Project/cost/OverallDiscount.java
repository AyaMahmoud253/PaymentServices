package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
class OverallDiscount extends Discount
{

	@Override
	public double cost(double amount) {
		
		return amount-0.1*amount;
	}
	
}
