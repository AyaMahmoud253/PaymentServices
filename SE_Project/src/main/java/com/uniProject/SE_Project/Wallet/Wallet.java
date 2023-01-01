package com.uniProject.SE_Project.Wallet;
import com.uniProject.SE_Project.payment.credit;
import com.uniProject.SE_Project.user.*;
import com.uniProject.SE_Project.payment.*;
public class Wallet {
	UsersModel u=new UsersModel();
	//credit c=new credit();
	Response R=new Response();
	double WalletBeforeadd;
    Wallet(double added){
    	//double l=(c.getLimit())-(added);
        //c.setLimit(l);
        WalletBeforeadd=u.getWalletAmount();
        double amount =u.getWalletAmount() +added ;
        u.setWalletAmount(amount);
    }
    String getWallet()
    {
    	R.setMessage(" Your credit Wallet Before add: "+WalletBeforeadd+"\n"+ " Your Wallet Now: "+u.getWalletAmount()+WalletBeforeadd+"\n"+ " This From Your Credit ");
    	return R.getMessage();
    }
}
