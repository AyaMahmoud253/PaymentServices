package com.uniProject.SE_Project.cost;
public abstract class Discount implements  Cost
{
	protected Cost decoratedCost;
    public Discount(Cost decoratedShape)
    {
        this.decoratedCost=decoratedCost;
    }    
    abstract public double cost(double amount);
}