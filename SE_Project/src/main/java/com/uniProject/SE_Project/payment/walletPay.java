package com.uniProject.SE_Project.payment;
import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uniProject.SE_Project.user.controller;
import com.uniProject.SE_Project.user.Response;


public class walletPay implements ordinaryPayment {

    Response R=new Response();

	

    @Override
	public String  Pay(double amount) {
		R.setMessage("you pay wallet "+amount);
		/**if (walletA>amount) {
            double newWalletAmount = walletA - amount;
            R.setMessage("you paid"+amount);
        }
        else {
        	R.setMessage("Not Enough Money in your Wallet");}**/
		return R.getMessage();
	}

}
