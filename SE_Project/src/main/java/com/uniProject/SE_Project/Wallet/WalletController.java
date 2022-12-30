package com.uniProject.SE_Project.Wallet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/Wallet")
public class WalletController {
	Wallet w;
	@RequestMapping(value = "/addToWallet/{added}",method = RequestMethod.GET)
    public String addToWallet(@PathVariable ("added") double added)
    {
	  w=new Wallet(added);
	  return w.getWallet();
    }
  
}
