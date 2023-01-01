package com.uniProject.SE_Project.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.uniProject.SE_Project.Refund.ProcessInformation;


@Component
public class RefundRepo{
	private final List<RefundInformation> RefundTrans;
	public RefundRepo() {
		this.RefundTrans=new ArrayList<>();
		
	}
	public boolean existById(int id) {
		for(RefundInformation transDb : RefundTrans) {
			if(transDb.getId()==id) {
				return true;
			}
		}
		return false;
	}
	public void AddRequest(RefundInformation refundmodels) {
		RefundTrans.add(refundmodels);
	}
	public List<RefundInformation> findById(int id) {
		List<RefundInformation> Trans = new ArrayList<>();
		for(RefundInformation r :RefundTrans) {
			if(r.getId()==id) {
				Trans.add(r);
			}
		}
		return Trans;
	}		
		
	
}
