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
import com.uniProject.SE_Project.serviceProvider.ProvidersRepo;
import com.uniProject.SE_Project.serviceProvider.ServiceProvider;

import java.util.List;
import java.util.Map;

import com.uniProject.SE_Project.user.Response;
import com.uniProject.SE_Project.payment.creditcardInfo;
@RestController
@RequestMapping(value = "/payment")

public class PaymentController {

    Response R=new Response();
    ordinaryPayment op;
    ProvidersRepo pRepo ;
    @Autowired
    public PaymentController(ProvidersRepo pRe) {
    	pRepo = pRe;
    }
    @RequestMapping(value = "/pay/{paymentMethod}",method = RequestMethod.POST)
    public String paycredit(@PathVariable ("paymentMethod") String pMethod,@RequestBody Map<String,Object> form ){
    	String m = pMethod;
    	Integer pID = Integer.parseInt(form.get("provider").toString());
    	ServiceProvider serviceProviderEntity = pRepo.findById(pID);
    	
    	if(!(serviceProviderEntity.checkForm(form))){
    		return serviceProviderEntity.getReqFields();
    	}
    	serviceProviderEntity.handle(form);
    	double amount = Double.parseDouble(form.get("Amount").toString());
    	if(m.equals("wallet"))
    	{
    		op = new walletPay();
    	}
    	else if(m.equals("cash")) {
    		op = new cash();
    	}
    	else 
    		op = new credit();
    	
        return op.Pay(amount);
    }
   
}
