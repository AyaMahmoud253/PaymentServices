package com.uniProject.SE_Project.Refund;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class ProcessRepo {
    
	private Map<Integer, ProcessInformation> Requestrepository;
	public ProcessRepo() {
		this.Requestrepository = new HashMap<>();
		ProcessInformation refund = new ProcessInformation(1, 100.0);
		this.Requestrepository.put(1, refund);
	}
	public String AddRequest(ProcessInformation refund) {
		Requestrepository.put(refund.getId(), refund);
		return "Added Sucessfully";
	}
	public List<ProcessInformation> getAll() {
		List<ProcessInformation> refunds = new ArrayList<>();
		
		for(ProcessInformation r : this.Requestrepository.values())
			refunds.add(r);
		
		return refunds;
	}
	public ProcessInformation getRequest(int id) {
		return Requestrepository.get(id);
	}
	public boolean  Search(int id) {
		Collection<ProcessInformation> refunds = Requestrepository.values();
		for (ProcessInformation refund : refunds) {
			if (refund.getId()==id)
				return true;
		}
		return false;
	}
	
    }
