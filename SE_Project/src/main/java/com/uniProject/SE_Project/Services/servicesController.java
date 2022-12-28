package com.uniProject.SE_Project.Services;

import com.uniProject.SE_Project.Services.ServicesFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uniProject.SE_Project.Services.ServicesFactory;
import com.uniProject.SE_Project.payment.cash;
import com.uniProject.SE_Project.payment.credit;
import com.uniProject.SE_Project.payment.walletPay;

@RestController
@RequestMapping(value = "/services")
public class servicesController {


    ServicesFactory ser=new ServicesFactory();
    @RequestMapping(value = "/search/{word}",method = RequestMethod.GET)
    public String SearchFor(@PathVariable ("word") String tofind){
        return ser.search(tofind);

    }






}
