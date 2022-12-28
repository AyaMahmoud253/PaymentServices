package com.uniProject.SE_Project.payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniProject.SE_Project.user.UsersModel;
import com.uniProject.SE_Project.user.logic;

import jakarta.websocket.server.PathParam;

import com.uniProject.SE_Project.user.Repo;
import com.uniProject.SE_Project.user.controller;
import com.uniProject.SE_Project.payment.PayEntity;
import com.uniProject.SE_Project.payment.credit;
import com.uniProject.SE_Project.payment.cash;
import com.uniProject.SE_Project.payment.walletPay;
import java.util.List;
import com.uniProject.SE_Project.user.Response;
import com.uniProject.SE_Project.payment.creditcardInfo;
@RestController
@RequestMapping(value = "/payment")

public class PaymentController {

    Response R=new Response();
    credit c=new credit();
    cash cah=new cash();
    walletPay walletP=new walletPay();
    @RequestMapping(value = "/pay-credit/{amount}",method = RequestMethod.GET)
    public String paycredit(@PathVariable ("amount") double amount){
        return c.Pay(amount);
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String d(){
        R.setMessage("dd");
        return R.getMessage();
    }

    @RequestMapping(value = "/pay-cash",method = RequestMethod.GET)
    public String paycash(){
        return cah.Pay();
    }
    @RequestMapping(value = "/pay-wallet/{amount}/{walletA}",method = RequestMethod.GET)
    public String paywithWallet(@PathVariable ("amount") double amount,
                                @PathVariable ("walletA") int w){
        return walletP.Pay(amount,w);
    }

}
