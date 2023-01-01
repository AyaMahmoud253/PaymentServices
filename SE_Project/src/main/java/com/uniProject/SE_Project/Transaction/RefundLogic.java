package com.uniProject.SE_Project.Transaction;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class RefundLogic{
	 private final  RefundRepo Repo;
	    public RefundLogic( RefundRepo Repo) {
	    	this.Repo=Repo;
	    }
	    public String addT(RefundInformation refundmodel) {
	    	if(Repo.existById(refundmodel.getId())) {
	    		Repo.AddRequest(refundmodel);
	    		return "This  is the same id that add refund request";
	    		
	    	}
	    	Repo.AddRequest(refundmodel);
	    	return "This is new id that add request";
	    }
	    public List<RefundInformation> getUserTrans(int id) {
	    	return Repo.findById(id);
	    }
}