package com.uniProject.SE_Project.cost;
import com.uniProject.SE_Project.Services.Services;
import com.uniProject.SE_Project.Services.ServicesModel;
public class  ConcreteCost implements Cost{
	   
	 public double cost(double amount,ServicesModel s,int serviceId) {s.setId((long) serviceId); return amount;}
	
}
