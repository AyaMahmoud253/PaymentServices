package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
public class SpecificDiscount extends Discount{
	public SpecificDiscount(Cost decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public double cost(double amount) {
		
		return amount-0.2*amount;
	}
	
}