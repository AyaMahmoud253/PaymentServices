package com.uniProject.SE_Project.cost;

import com.uniProject.SE_Project.Services.Services;
import com.uniProject.SE_Project.Services.ServicesModel;
public abstract class Discount implements  Cost
{
	protected Cost decoratedCost;
    public Discount(Cost decoratedShape)
    {
        this.decoratedCost=decoratedCost;
    }    
    abstract public double cost(double amount,ServicesModel s,int serviceId);
}