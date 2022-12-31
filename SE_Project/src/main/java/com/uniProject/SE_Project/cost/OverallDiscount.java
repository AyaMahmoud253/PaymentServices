package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
public class OverallDiscount extends Discount
{
   
	public OverallDiscount(Cost cost) {
		super(cost);
		}
 
	@Override
	public double cost(double amount) {
		return amount-0.1*amount;
	}
	
}
