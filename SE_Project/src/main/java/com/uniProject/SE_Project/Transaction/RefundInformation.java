package com.uniProject.SE_Project.Transaction;

public class RefundInformation {

    private int id;
    private double Refundtrans ;
    public RefundInformation(int id,int RefundTrans) {
    	this.id=id;
    	this.Refundtrans=RefundTrans;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public double getRefund() {
        return Refundtrans;
    }

    public void setRefund(double Refundtrans) {
        this.Refundtrans = Refundtrans;
    }
}
	

