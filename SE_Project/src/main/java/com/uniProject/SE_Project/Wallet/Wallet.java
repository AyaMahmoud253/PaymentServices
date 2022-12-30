package com.uniProject.SE_Project.Wallet;
import com.uniProject.SE_Project.payment.credit;
import com.uniProject.SE_Project.user.*;
import com.uniProject.SE_Project.payment.*;
public class Wallet {
	UsersModel u=new UsersModel();
	credit c=new credit();
	Response R=new Response();
	double limitBeforeadd=c.getLimit();
    Wallet(double added){
    	double l=(c.getLimit())-(added);
        c.setLimit(l);
        double amount =u.getWalletAmount() +added ;
        u.setWalletAmount(amount);
    }
    String getWallet()
    {
    	R.setMessage(" Your credit limit Before add: "+limitBeforeadd+"\n"+ " Your Wallet Now: "+u.getWalletAmount() +"\n"+" Your credit limit Now: "+ c.getLimit());
    	return R.getMessage();
    }
}
