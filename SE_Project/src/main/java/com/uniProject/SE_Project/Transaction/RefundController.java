package com.uniProject.SE_Project.Transaction;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RefundController{
    private RefundLogic refundlogic;
    public RefundController(RefundLogic refundlogic) {
    	this.refundlogic= refundlogic;
    	
    }
    @RequestMapping(value="/Trans",method=RequestMethod.POST)
    public String AddRequestRefund(@RequestBody RefundInformation transmodel) {
    	return refundlogic.addT(transmodel);
    }
    @RequestMapping(value="/Trans/{id}",method=RequestMethod.GET)
    public List<RefundInformation> getRefundTrans(@PathVariable("id")int id) {
    	return refundlogic.getUserTrans(id);
    }
    

}
