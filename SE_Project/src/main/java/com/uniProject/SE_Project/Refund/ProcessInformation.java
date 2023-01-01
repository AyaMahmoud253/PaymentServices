package com.uniProject.SE_Project.Refund;


public class ProcessInformation {
   private  int id;
   private double AmountReturned;
   public ProcessInformation(int id,double AmountReturned) {
	   this.id=id;
	   this.AmountReturned=AmountReturned;
   }
   public double getAmount() {
	   return AmountReturned;
   }
   public void SetAmount(double AmountReturned) {
	   this.AmountReturned= AmountReturned;
   }
   public int getId() {
	   return id;
   }
   public void setId(int id) {
	   this.id=id;
   }
}
